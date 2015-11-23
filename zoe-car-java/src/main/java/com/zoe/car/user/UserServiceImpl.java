package com.zoe.car.user;

import com.zoe.car.error.FailureCode;
import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.workbench.crud.CrudService;
import com.zoe.commons.workbench.domain.ResultModel;
import com.zoe.commons.workbench.ui.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * UserServiceImpl
 *
 * @author Dai Wenqing
 * @date 2015/11/13
 */
@Service("car.user.service")
public class UserServiceImpl implements UserService {

    @Autowired
    private CrudService crudService;

    @Override
    public ResultModel<UserModel> register(String uri, UserModel userModel) {
        ResultModel<UserModel> resultModel = new ResultModel<>();
        resultModel.setSuccess(true);
        ResultModel<UserModel> existUserModel = exist(uri, userModel);
        if (!existUserModel.getSuccess()) {
            // todo 密码加密
            crudService.save(uri, userModel);
            resultModel.setData(userModel);
        } else {
            // errorMessages.add(FailureCode.e40003);
            resultModel.setErrorCode(FailureCode.E_EXIST);
            resultModel.setSuccess(false);
            resultModel.setData(existUserModel.getData());
        }
        return resultModel;
    }

    public ResultModel<UserModel> exist(String uri, UserModel userModel) {
        Map<String, Criterion> criterionMap = new LinkedHashMap<>();
        criterionMap.put("phone", Criterion.Equals);
        ResultModel<UserModel> userModelResultModel = new ResultModel<>();
        List<Object> args = new ArrayList<>();
        args.add(userModel.getPhone());
        PageList<UserModel> pageList = crudService.query(uri, criterionMap, args);
        if (pageList.getList().size() > 0) {
            userModelResultModel.setSuccess(true);
            userModelResultModel.setData(pageList.getList().get(0));
        } else {
            userModelResultModel.setSuccess(false);
            userModelResultModel.setData(null);
        }
        return userModelResultModel;
    }
}
