package com.zoe.car.user;

import com.mysql.fabric.xmlrpc.base.Data;
import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.role.RoleModel;
import com.zoe.commons.dao.model.Jsonable;
import com.zoe.commons.workbench.base.BaseModelCodeSupport;
import com.zoe.commons.workbench.ui.Automation;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * UserModel
 *
 * @author Dai Wenqing
 * @date 2015/10/11
 */

@Component("car.user.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_info")
public class UserModel extends BaseModelCodeSupport implements Automation {
    private RoleModel roleModel;
    private String phone;
    private String password;
    private String sePassword;
    private String username;
    private String nickname;
    private Date birthday;
    private int identityType;
    private String identityNo;
    private String weibo;
    private String webchat;
    private String email;
    private String photo;
    private int anonymous = 0;

    private int sex;
    private String qq;
    private String maritalState;
    private int type;
    private String realName;
    private Date lastLoginTime;
    private String lastLoginIp;
    private int sort;

    @Column(name = "anonymous")
    @Jsonable
    public int getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }

    @Column(name = "photo")
    @Jsonable
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @ManyToOne
    @JoinColumn(name = "role_id")
    @Jsonable
    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }

    @Column(name = "phone")
    @Jsonable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "se_password")
    public String getSePassword() {
        return sePassword;
    }

    public void setSePassword(String sePassword) {
        this.sePassword = sePassword;
    }

    @Column(name = "username")
    @Jsonable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "nickname")
    @Jsonable
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "birthday")
    @Jsonable
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "identity_type")
    @Jsonable
    public int getIdentityType() {
        return identityType;
    }

    public void setIdentityType(int identityType) {
        this.identityType = identityType;
    }

    @Column(name = "identity_no")
    @Jsonable
    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    @Column(name = "weibo")
    @Jsonable
    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    @Column(name = "webchat")
    @Jsonable
    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat;
    }

    @Column(name = "email")
    @Jsonable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "sex")
    @Jsonable
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Column(name = "qq")
    @Jsonable
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Column(name = "marital_state")
    @Jsonable
    public String getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(String maritalState) {
        this.maritalState = maritalState;
    }

    @Column(name = "type")
    @Jsonable
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Column(name = "real_name")
    @Jsonable
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Column(name = "last_login_time")
    @Jsonable
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Column(name = "last_login_ip")
    @Jsonable
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Column(name = "sort")
    @Jsonable
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
