package com.zoe.car.message;

import com.zoe.car.error.FailureCode;
import com.zoe.car.message.view.model.Content;
import com.zoe.car.message.view.model.Message;
import com.zoe.car.message.view.model.Post;
import com.zoe.car.user.AnonymousUserModel;
import com.zoe.car.user.UserModel;
import com.zoe.car.user.UserService;
import com.zoe.commons.cache.Cache;
import com.zoe.commons.ctrl.context.Session;
import com.zoe.commons.ctrl.execute.Execute;
import com.zoe.commons.ctrl.validate.Validate;
import com.zoe.commons.ctrl.validate.Validators;
import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.dao.orm.PageListImpl;
import com.zoe.commons.util.Generator;
import com.zoe.commons.util.Geo;
import com.zoe.commons.workbench.base.BaseControllerSupport;
import com.zoe.commons.workbench.domain.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * MessageCtrl
 *
 * @author Dai Wenqing
 * @date 2015/11/2
 */
@Controller("com.zoe.car.message.ctrl")
@Execute(name = "/car/message")
public class MessageCtrl extends BaseControllerSupport {
    @Autowired
    private UserService userService;
    @Autowired
    private Session session;
    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageHelper messageHelper;

    @Execute(name = "/view/public", type = "freemarker", template = "module/message/public")
    public int getPublicView() {
        return 1;
    }

    /**
     * 发布消息
     *
     * @return
     */
    @Execute(name = "/data/public/submit")
    public Object publicMessage() {
        MessageModel messageModel = new MessageModel();
        request.setToModel(messageModel);
        String goTimeStr = request.get("date") + " " + request.get("hour") + ":" + request.get("minute") + ":00";
        messageModel.setGoTime(converter.toDate(goTimeStr));
        String uri = uiHelper.getUri(this.getClass());
        UserModel userModel = session.get("user");
        // 匿名用户
        if (userModel == null) {
            // messageModel.setCreateUser(generator.uuid());
            userModel = new UserModel();
            AnonymousUserModel anonymousUserModel = new AnonymousUserModel();
            userModel.setPassword(anonymousUserModel.getPassword());
            userModel.setPhone(messageModel.getPhone());
            userModel.setNickname(anonymousUserModel.getNickname());
            userModel.setUsername(anonymousUserModel.getName());
            userModel.setPhoto(anonymousUserModel.getPhoto());
            userModel.setAnonymous(1);
            // 为匿名用户注册一个账号
            ResultModel<UserModel> userModelResultModel = userService.register(uiHelper.getUri(UserModel.class), userModel);
            messageModel.setCreateUser(userModelResultModel.getData().getId());
            // 获取geohash
            messageModel.setStartGeohash(Geo.encode(messageModel.getStartLatitude(), messageModel.getStartLongitude()));
            messageModel.setEndGeohash(Geo.encode(messageModel.getEndLatitude(), messageModel.getEndLongitude()));

        } else {
            messageModel.setCreateUser(userModel.getId());
        }
        /**
         * 增加判断是否已经添加过消息，防止同一消息同一时间多次被录入
         */
        List<MessageModel> messageModels = new ArrayList<>();
        messageModels.add(messageModel);
        Message messageViewModel = getMessageViewModel(-1, -1, 0, messageModels);

        boolean result = true;
        boolean hasSave = crudService.hasSave(uri, messageModel, messageModel.getGoTime().toString(), messageModel.getStartGeohash(),
                messageModel.getEndGeohash());
        if (!hasSave) {
            // 添加到消息队列，同时入库

            crudService.save(uri, messageModel);
        }
        if (result) {
            if (!hasSave)
                return success(messageViewModel, "");
            else
                return success();
        } else
            return failure(FailureCode.E_ADD_ERROR);
    }

    /**
     * 获取消息
     *
     * @return
     */
    @Execute(name = "/data/query")
    public Object getMessage() {
        int pageSize = request.getAsInt("pageSize");
        int pageNum = request.getAsInt("pageNum");

        /**
         * 0 = 附近 1 = 与我相关 3 = 团拼的
         */
        int type = request.getAsInt("type");
        double latitude = converter.toDouble(request.get("latitude"));
        double longitude = converter.toDouble(request.get("longitude"));

        List<MessageModel> list = null;
        if (type == 0)
            list = messageHelper.search(Geo.encode(latitude, longitude), pageSize, pageNum);
        Message messageViewModel = getMessageViewModel(pageSize, pageNum, type, list);
        return success(messageViewModel, "");
    }

    private Message getMessageViewModel(int pageSize, int pageNum, int type, List<MessageModel> list) {
        Message messageViewModel = new Message();
        // 获取当前用户信息
        UserModel userModel = session.get("user");
        if (list != null) {
            messageViewModel.setPageNum(pageNum);
            messageViewModel.setType(type);
            messageViewModel.setPageSize(pageSize);

            list.forEach(c -> {
                Post postViewModel = new Post();
                messageViewModel.getPosts().add(postViewModel);
                postViewModel.setUserId(c.getCreateUser());
                postViewModel.setCreateTime(converter.toString(c.getCreateTime()));
                //AnonymousUserModel anonymousUserModel = new AnonymousUserModel();

                // 获取发布消息用户
                UserModel userModelPublic = crudService.findById(uiHelper.getUri(UserModel.class), c.getCreateUser());
                postViewModel.setPhoto(userModelPublic.getPhoto());
                postViewModel.setName(userModelPublic.getUsername());

                Content contentViewModel = new Content();
                postViewModel.setContent(contentViewModel);
                contentViewModel.setDate(converter.toString(c.getGoTime()));
                contentViewModel.setDateCn(converter.toDateCn(c.getGoTime()));
                contentViewModel.setEnd(c.getEnd());
                contentViewModel.setTime(converter.toString(c.getGoTime()));
                Calendar calendar = Calendar.getInstance();
                contentViewModel.setTimeCn(calendar.get(Calendar.HOUR_OF_DAY) + "点");
                contentViewModel.setLeft(c.getLeftCount());
                if (userModel == null || userModel.getAnonymous() == 1)
                    contentViewModel.setPhone(converter.toProtectPhone(c.getPhone()));
                else
                    contentViewModel.setPhone(c.getPhone());
                contentViewModel.setStart(c.getStart());
                String[] gobys = c.getGoby().split(";;");
                for (String goby : gobys) {
                    contentViewModel.getGoby().add(goby);
                }
            });
        }
        return messageViewModel;
    }

    @Execute(name = "/data/search")
    public Object searchMessage() {
        return "";
    }

}
