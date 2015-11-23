package com.zoe.car.user;

import com.zoe.car.error.FailureCode;
import com.zoe.commons.ctrl.execute.Execute;
import com.zoe.commons.ctrl.http.context.Cookie;
import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.util.Converter;
import com.zoe.commons.util.Generator;
import com.zoe.commons.util.Msm;
import com.zoe.commons.workbench.base.BaseControllerSupport;
import com.zoe.commons.workbench.domain.ResultModel;
import com.zoe.commons.workbench.ui.Criterion;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;

/**
 * UserCtrl
 *
 * @author Dai Wenqing
 * @date 2015/11/9
 */
@Controller("com.zoe.car.user.ctrl")
@Execute(name = "/car/user")
public class UserCtrl extends BaseControllerSupport {

    @Autowired
    private Generator generator;
    @Autowired
    private Msm msm;
    @Autowired
    private UserService userService;
    @Autowired
    protected Cookie cookie;

    @Execute(name = "/v/login", template = "module/user/base/html/login", type = "freemarker")
    public Object getLoginView() {
        return "";
    }

    @Execute(name = "/v/register", template = "module/user/base/html/register", type = "freemarker")
    public Object getRegister() {
        return "";
    }

    @Execute(name = "/data/register/submit")
    public Object register() {
        UserModel userModel = new UserModel();
        request.setToModel(userModel);
        String uri = uiHelper.getUri(UserModel.class);
        // boolean result = crudService.save(uri, userModel);
        ResultModel resultModel = userService.register(uri, userModel);

        if (resultModel.getSuccess())
            return success();
        else
            return failure(resultModel.getErrorCode()); // templates.get().failure(resultModel.getErrorCode());
    }

    @Execute(name = "/data/verification-code/get")
    public Object getPhoneVerificationCode() {
        int random = generator.random(1000, 9999);
        session.set("random", random);
        msm.send();
        return success(random, "");// templates.get().success(random, "");
    }

    @Execute(name = "/data/login/submit")
    public Object login() {
        Map<String, Criterion> criterionMap = new LinkedHashMap<>();
        criterionMap.put("phone", Criterion.Equals);
        criterionMap.put("password", Criterion.Equals);
        List<Object> args = new ArrayList<>();
        args.add(request.get("phone"));
        args.add(request.get("password"));
        String uri = uiHelper.getUri(UserModel.class);
        // 手机号码进行验证
        PageList<UserModel> userModelPageList = crudService.query(uri, criterionMap, args, true);
        if (userModelPageList.getList().size() == 0) {
            // 用用户名进行验证
            /*
             * criterionMap = new LinkedHashMap<>();
             * criterionMap.put("username", Criterion.Equals);
             * criterionMap.put("password", Criterion.Equals); userModelPageList
             * = crudService.query(uri, criterionMap, args, true); if
             * (userModelPageList.getList().size() == 0)
             * templates.get().failure(FailureCode.E_IN_ILLEGAL,
             * this.getClass().getPackage().getName());
             */

            return failure(FailureCode.E_IN_ILLEGAL);
        } else if (userModelPageList.getList().get(0).getAnonymous() == 1) {
            //用户虽然已经存在，但是未进行验证或绑定
            return failure(FailureCode.E_IN_ILLEGAL);
        }

        String token = generator.random(32);
        if (userModelPageList.getList().size() > 0) {
            session.set("user", userModelPageList.getList().get(0));
            session.set(token, userModelPageList.getList().get(0));
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", token);
        jsonObject.put("Expiration", converter.getExpiration(30).getTime());
        cookie.add("token", token, "", 21600 * 60);
        return success(jsonObject, "");
    }

}
