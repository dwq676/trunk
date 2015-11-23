package com.zoe.car.platform;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PlatformModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.platform.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_platform_info")
public class PlatformModel extends BaseModelSortSupport {

    /*
     * name keyword km cost start_province start_city start_county start_town
     * start_village end_province end_city end_county end_town end_village
     */

    private String name;
    private String keyword;
    private int km;
    private int cost;

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

    @Column(name = "name")
    @Jsonable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "keyword")
    @Jsonable
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Column(name = "km")
    @Jsonable
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Column(name = "cost")
    @Jsonable
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

}
