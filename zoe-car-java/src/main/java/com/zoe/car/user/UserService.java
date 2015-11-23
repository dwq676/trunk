package com.zoe.car.user;

import com.zoe.commons.workbench.domain.ResultModel;

/**
 * UserService
 *
 * @author Dai Wenqing
 * @date 2015/11/13
 */
public interface UserService {
    /**
     * 判断用户是否存在，不存在则进行注册
     * 
     * @param uri
     * @param userModel
     * @return 成功则返回当前用户便于获取用户ID，失败则返回已存在的用户
     */
    ResultModel<UserModel> register(String uri, UserModel userModel);

    /**
     *
     * @param uri 资源定位地址
     * @param userModel 欲注册的用户
     * @return 如果存在则返回已存在的用户
     */
    ResultModel<UserModel> exist(String uri, UserModel userModel);
}
