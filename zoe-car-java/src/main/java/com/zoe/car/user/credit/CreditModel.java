package com.zoe.car.user.credit;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * CreditModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.credit.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_credit")
public class CreditModel extends BaseModelSortSupport {

    /*
     * user_id auth_level tip_times praise_times success_times point create_time
     * modify_time modify_user create_user valid_flag sort remarik domain
     */

    private UserModel userModel;
    private int authLevel;
    private int tipTimes;
    private int praiseTimes;
    private int successTimes;
    private int point;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Column(name = "auth_level")
    @Jsonable
    public int getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(int authLevel) {
        this.authLevel = authLevel;
    }

    @Column(name = "tip_times")
    @Jsonable
    public int getTipTimes() {
        return tipTimes;
    }

    public void setTipTimes(int tipTimes) {
        this.tipTimes = tipTimes;
    }

    @Column(name = "praise_times")
    @Jsonable
    public int getPraiseTimes() {
        return praiseTimes;
    }

    public void setPraiseTimes(int praiseTimes) {
        this.praiseTimes = praiseTimes;
    }
    @Column(name = "success_times")
    @Jsonable
    public int getSuccessTimes() {
        return successTimes;
    }

    public void setSuccessTimes(int successTimes) {
        this.successTimes = successTimes;
    }
    @Column(name = "point")
    @Jsonable
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
