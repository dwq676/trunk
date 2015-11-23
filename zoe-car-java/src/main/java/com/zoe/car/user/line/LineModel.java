package com.zoe.car.user.line;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.CarModel;
import com.zoe.car.platform.PlatformModel;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.PrimitiveIterator;

/**
 * LineModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.line.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_line")
public class LineModel extends BaseModelSortSupport {

    /*
     *    start_province start_city start_county
     * start_town start_village end_province end_city end_county end_town
     * end_village goby keyword repeats
     */
    private UserModel userModel;
    private CarModel carModel;
    private PlatformModel platformModel;
    private String startProvince;
    private String startCity;
    private String startCounty;
    private String startTown;
    private String startVillage;
    private String endProvince;
    private String endCity;
    private String endCounty;
    private String endTown;
    private String endVillage;
    private String goby;
    private String keyword;
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

    @ManyToOne
    @JoinColumn(name = "car_id")
    @Jsonable
    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
    @ManyToOne
    @JoinColumn(name = "platform_id")
    @Jsonable
    public PlatformModel getPlatformModel() {
        return platformModel;
    }

    public void setPlatformModel(PlatformModel platformModel) {
        this.platformModel = platformModel;
    }
    @Column(name = "start_province")
    @Jsonable
    public String getStartProvince() {
        return startProvince;
    }

    public void setStartProvince(String startProvince) {
        this.startProvince = startProvince;
    }
    @Column(name = "start_city")
    @Jsonable
    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }
    @Column(name = "start_county")
    @Jsonable
    public String getStartCounty() {
        return startCounty;
    }

    public void setStartCounty(String startCounty) {
        this.startCounty = startCounty;
    }
    @Column(name = "start_town")
    @Jsonable
    public String getStartTown() {
        return startTown;
    }

    public void setStartTown(String startTown) {
        this.startTown = startTown;
    }
    @Column(name = "start_village")
    @Jsonable
    public String getStartVillage() {
        return startVillage;
    }

    public void setStartVillage(String startVillage) {
        this.startVillage = startVillage;
    }
    @Column(name = "end_province")
    @Jsonable
    public String getEndProvince() {
        return endProvince;
    }

    public void setEndProvince(String endProvince) {
        this.endProvince = endProvince;
    }
    @Column(name = "end_city")
    @Jsonable
    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }
    @Column(name = "end_county")
    @Jsonable
    public String getEndCounty() {
        return endCounty;
    }

    public void setEndCounty(String endCounty) {
        this.endCounty = endCounty;
    }
    @Column(name = "end_town")
    @Jsonable
    public String getEndTown() {
        return endTown;
    }

    public void setEndTown(String endTown) {
        this.endTown = endTown;
    }
    @Column(name = "end_village")
    @Jsonable
    public String getEndVillage() {
        return endVillage;
    }

    public void setEndVillage(String endVillage) {
        this.endVillage = endVillage;
    }
    @Column(name = "goby")
    @Jsonable
    public String getGoby() {
        return goby;
    }

    public void setGoby(String goby) {
        this.goby = goby;
    }
    @Column(name = "keyword")
    @Jsonable
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
