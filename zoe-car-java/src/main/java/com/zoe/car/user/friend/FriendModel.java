package com.zoe.car.user.friend;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * FriendModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.friend.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_friend")
public class FriendModel extends BaseModelSortSupport {
    /*
     * id user friend success_times create_time modify_time modify_user
     * create_user valid_flag sort remarik domain
     */
    private UserModel userModel;
    private UserModel friend;
    private int successTimes;
    private int atTo;

    @ManyToOne
    @JoinColumn(name = "user")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
    @ManyToOne
    @JoinColumn(name = "friend")
    @Jsonable
    public UserModel getFriend() {
        return friend;
    }

    public void setFriend(UserModel friend) {
        this.friend = friend;
    }
    @Column(name = "success_times")
    @Jsonable
    public int getSuccessTimes() {
        return successTimes;
    }

    public void setSuccessTimes(int successTimes) {
        this.successTimes = successTimes;
    }

    @Column(name = "at_to")
    @Jsonable
    public int getAtTo() {
        return atTo;
    }

    public void setAtTo(int atTo) {
        this.atTo = atTo;
    }
}
