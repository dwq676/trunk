package com.zoe.car.user.address;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * AddressModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.address.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_address")
public class AddressModel extends BaseModelSortSupport {
    // private String userId;
    private UserModel userModel;
    private String workProvince;
    private String workCity;
    private String workCounty;
    private String workTown;
    private String workVillage;
    private String workHouseno;
    private String resideProvince;
    private String resideCity;
    private String resideCounty;
    private String resideTown;
    private String resideVillage;
    private String resideHouseno;
    private Date workTime;
    private Date backTime;
    private int repeats;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Column(name = "work_province")
    @Jsonable
    public String getWorkProvince() {
        return workProvince;
    }

    public void setWorkProvince(String workProvince) {
        this.workProvince = workProvince;
    }

    @Column(name = "work_city")
    @Jsonable
    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    @Column(name = "work_county")
    @Jsonable
    public String getWorkCounty() {
        return workCounty;
    }

    public void setWorkCounty(String workCounty) {
        this.workCounty = workCounty;
    }

    @Column(name = "work_town")
    @Jsonable
    public String getWorkTown() {
        return workTown;
    }

    public void setWorkTown(String workTown) {
        this.workTown = workTown;
    }

    @Column(name = "work_village")
    @Jsonable
    public String getWorkVillage() {
        return workVillage;
    }

    public void setWorkVillage(String workVillage) {
        this.workVillage = workVillage;
    }

    @Column(name = "work_houseno")
    @Jsonable
    public String getWorkHouseno() {
        return workHouseno;
    }

    public void setWorkHouseno(String workHouseno) {
        this.workHouseno = workHouseno;
    }

    @Column(name = "reside_province")
    @Jsonable
    public String getResideProvince() {
        return resideProvince;
    }

    public void setResideProvince(String resideProvince) {
        this.resideProvince = resideProvince;
    }

    @Column(name = "reside_city")
    @Jsonable
    public String getResideCity() {
        return resideCity;
    }

    public void setResideCity(String resideCity) {
        this.resideCity = resideCity;
    }

    @Column(name = "reside_county")
    @Jsonable
    public String getResideCounty() {
        return resideCounty;
    }

    public void setResideCounty(String resideCounty) {
        this.resideCounty = resideCounty;
    }

    @Column(name = "reside_town")
    @Jsonable
    public String getResideTown() {
        return resideTown;
    }

    public void setResideTown(String resideTown) {
        this.resideTown = resideTown;
    }

    @Column(name = "reside_village")
    @Jsonable
    public String getResideVillage() {
        return resideVillage;
    }

    public void setResideVillage(String resideVillage) {
        this.resideVillage = resideVillage;
    }

    @Column(name = "reside_houseno")
    @Jsonable
    public String getResideHouseno() {
        return resideHouseno;
    }

    public void setResideHouseno(String resideHouseno) {
        this.resideHouseno = resideHouseno;
    }

    @Column(name = "work_time")
    @Jsonable
    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    @Column(name = "back_time")
    @Jsonable
    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    @Column(name = "repeats")
    @Jsonable
    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }
}
