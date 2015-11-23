package com.zoe.car.user.auth;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.PrimitiveIterator;

/**
 * AuthModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.auth.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_auth")
public class AuthModel extends BaseModelSortSupport {
    /*
     * id user_id type status picture_1 picture_2 picture_3 create_time
     * modify_time modify_user create_user valid_flag sort remarik domain
     */

    private int type;
    private int status;
    private byte[] picture_1;
    private byte[] picture_2;
    private byte[] picture_3;
    private UserModel userModel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Column(name = "type")
    @Jsonable
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Column(name = "status")
    @Jsonable
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    @Column(name = "picture_1")
    @Jsonable
    public byte[] getPicture_1() {
        return picture_1;
    }

    public void setPicture_1(byte[] picture_1) {
        this.picture_1 = picture_1;
    }
    @Column(name = "picture_2")
    @Jsonable
    public byte[] getPicture_2() {
        return picture_2;
    }

    public void setPicture_2(byte[] picture_2) {
        this.picture_2 = picture_2;
    }
    @Column(name = "picture_3")
    @Jsonable
    public byte[] getPicture_3() {
        return picture_3;
    }

    public void setPicture_3(byte[] picture_3) {
        this.picture_3 = picture_3;
    }
}
