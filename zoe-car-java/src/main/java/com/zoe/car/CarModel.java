package com.zoe.car;

import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import com.zoe.commons.workbench.base.BaseModelSupport;
import com.zoe.commons.workbench.ui.Automation;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * CarModel
 *
 * @author Dai Wenqing
 * @date 2015/10/11
 */
@Component("car.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_car")
public class CarModel extends BaseModelSortSupport  {
    private UserModel userModel;
    private String color;
    private String model;
    private String modelCode;
    private int van;
    private int seat;
    private int lefts;
    private String licence;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Column(name = "color")
    @Jsonable
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "model")
    @Jsonable
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "model_code")
    @Jsonable
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    @Column(name = "van")
    @Jsonable
    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }

    @Column(name = "seat")
    @Jsonable
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Column(name = "lefts")
    @Jsonable
    public int getLefts() {
        return lefts;
    }

    public void setLefts(int lefts) {
        this.lefts = lefts;
    }

    @Column(name = "licence")
    @Jsonable
    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
