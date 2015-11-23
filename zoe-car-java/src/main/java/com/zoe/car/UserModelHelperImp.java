package com.zoe.car;

import com.zoe.car.user.UserModel;
import com.zoe.commons.ctrl.context.Session;
import com.zoe.commons.workbench.domain.UserModelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * UserModelHelperImp
 *
 * @author Dai Wenqing
 * @date 2015/11/7
 */
@Component("car.user.model.helper")
public class UserModelHelperImp implements UserModelHelper {
    @Autowired
    private Session session;

    @Override
    public String getUserId() {
        UserModel userModel = session.get("user");
        if (userModel == null)
            return "1";
        return userModel.getId();
    }

    @Override
    public String getForUserName() {
        UserModel userModel = session.get("user");
        if (userModel == null)
            return "1";
        return userModel.getUsername();
    }

    @Override
    public String getForDomain() {
        UserModel userModel = session.get("user");
        if (userModel == null)
            return "1";
        return userModel.getDomain();
    }

    @Override
    public String getForPassword() {
        UserModel userModel = session.get("user");
        if (userModel == null)
            return "1";
        return userModel.getPassword();
    }
}
