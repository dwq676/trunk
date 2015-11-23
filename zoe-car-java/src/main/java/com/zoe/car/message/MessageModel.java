package com.zoe.car.message;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.CarModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * MessageModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.message.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_pin_message")
public class MessageModel extends BaseModelSortSupport {

    /*
     * platform_id line_id time start end goby left_count phone read_status
     * create_time modify_time modify_user create_user valid_flag sort remark
     * domain
     */

    /*
     * private PlatformModel platformModel; private LineModel lineModel;
     */
    private Date goTime;
    private String start;
    private String end;
    private String goby;
    private int leftCount;
    private int totalCount;
    private String phone;
    private double startLongitude;
    private double startLatitude;
    private String startGeohash;
    private double endLongitude;
    private double endLatitude;
    private String endGeohash;
    private int readStatus;
    private CarModel carModel;

    @Jsonable
    @Column(name = "total_count")
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Jsonable
    @Column(name = "start_latitude")
    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    @Jsonable
    @Column(name = "end_longitude")
    public double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(double endLongitude) {
        this.endLongitude = endLongitude;
    }

    @Jsonable
    @Column(name = "end_geohash")
    public String getEndGeohash() {
        return endGeohash;
    }

    public void setEndGeohash(String endGeohash) {
        this.endGeohash = endGeohash;
    }

    @Jsonable
    @Column(name = "start_geohash")
    public String getStartGeohash() {
        return startGeohash;
    }

    public void setStartGeohash(String startGeohash) {
        this.startGeohash = startGeohash;
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

    /*
     * @ManyToOne
     * 
     * @JoinColumn(name = "platform_id")
     * 
     * @Jsonable public PlatformModel getPlatformModel() { return platformModel;
     * }
     * 
     * public void setPlatformModel(PlatformModel platformModel) {
     * this.platformModel = platformModel; }
     * 
     * @ManyToOne
     * 
     * @JoinColumn(name = "line_id")
     * 
     * @Jsonable public LineModel getLineModel() { return lineModel; }
     * 
     * public void setLineModel(LineModel lineModel) { this.lineModel =
     * lineModel; }
     */
    @Jsonable
    @Column(name = "start_longitude")
    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    @Jsonable
    @Column(name = "end_latitude")
    public double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(double endLatitude) {
        this.endLatitude = endLatitude;
    }

    @Jsonable
    @Column(name = "go_time")
    @Temporal(TemporalType.DATE)
    public Date getGoTime() {
        return goTime;
    }

    public void setGoTime(Date goTime) {
        this.goTime = goTime;
    }

    /*
     * @Jsonable
     * 
     * @Column(name = "go_time") public Date getTime() { return goTime; }
     * 
     * public void setTime(Date time) { this.time = time; }
     */
    @Jsonable
    @Column(name = "location_start")
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Jsonable
    @Column(name = "location_end")
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Jsonable
    @Column(name = "goby")
    public String getGoby() {
        return goby;
    }

    public void setGoby(String goby) {
        this.goby = goby;
    }

    @Jsonable
    @Column(name = "left_count")
    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }

    @Jsonable
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Jsonable
    @Column(name = "read_status")
    public int getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(int readStatus) {
        this.readStatus = readStatus;
    }

    /*
     * @ManyToOne
     *
     * @JoinColumn(name = "from_user")
     *
     * @Jsonable
     *
     * @Column(name = "content")
     */

}
