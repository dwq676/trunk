package com.zoe.car.message;

import com.zoe.car.user.UserModel;
import com.zoe.commons.bean.ContextRefreshedListener;
import com.zoe.commons.cache.Cache;
import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.dao.orm.PageListImpl;
import com.zoe.commons.workbench.crud.CrudService;
import com.zoe.commons.workbench.ui.Criterion;
import com.zoe.commons.workbench.ui.UiHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 服务启动时 从库里取所有消息放到消息队列
 *
 * @author Dai Wenqing
 * @date 2015/11/16
 */
@Controller("com.zoe.car.message")
public class MessageHelperImpl implements ContextRefreshedListener, MessageHelper {
    private int prefixLength = 4;
    private String messageKey = "car_message_all";
    @Autowired
    private Cache cache;
    @Autowired
    private CrudService crudService;
    @Autowired
    private UiHelper uiHelper;

    @Override
    public int getContextRefreshedSort() {
        return 99;
    }

    @Override
    public void onContextRefreshed() {
        refresh();
    }

    @Override
    public void refresh() {
        String uri = uiHelper.getUri(MessageModel.class);
        PageList<MessageModel> messageModelPageList = crudService.query(uri, null, null, true);
        messageModelPageList.getList().forEach(c -> {
            add(c);
        });
    }

    @Override
    public void add(MessageModel messageModel) {
        List<MessageModel> messageModelList;
        List<MessageModel> allMessModelList = cache.get(messageKey);
        String prefixKey = messageModel.getStartGeohash().substring(0, prefixLength);
        messageModelList = cache.get(prefixKey);
        if (messageModelList == null) {
            messageModelList = new ArrayList<>();
            cache.put(prefixKey, messageModelList, true);
        }
        messageModelList.add(messageModel);
        if (allMessModelList == null) {
            allMessModelList = new ArrayList<>();
            cache.put(messageKey, allMessModelList, true);
        }
        allMessModelList.add(messageModel);
    }

    @Override
    public List<MessageModel> search(int pageSize, int pageNum) {
        return null;
    }

    @Override
    public List<MessageModel> search(String geohash, int pageSize, int pageNum) {
        String prefixKey = geohash.substring(0, prefixLength);
        List<MessageModel> messageModelList = cache.get(prefixKey);
        List<MessageModel> messageResultModels = new ArrayList<>();
        if (messageModelList != null) {
            if ((pageSize * pageNum) <= messageModelList.size()) {
                //按时间进行降序
                messageResultModels = messageModelList.parallelStream().sorted(Comparator.comparing(MessageModel::getCreateTime).reversed())
                        .collect(Collectors.toList()).subList(pageSize * (pageNum - 1), pageSize * pageNum);
            } else if (pageSize * (pageNum - 1) <= messageModelList.size()) {
                messageResultModels = messageModelList.parallelStream().sorted(Comparator.comparing(MessageModel::getCreateTime).reversed())
                        .collect(Collectors.toList()).subList(pageSize * (pageNum - 1), messageModelList.size());
            }
        }
        return messageResultModels;
    }

    @Override
    public List<MessageModel> search(UserModel userModel, int pageSize, int pageNum) {
        return null;
    }
}
