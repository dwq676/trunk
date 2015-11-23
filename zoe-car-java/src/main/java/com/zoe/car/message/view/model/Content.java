package com.zoe.car.message.view.model;

import org.apache.poi.hssf.record.LeftMarginRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Content
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
public class Content {
    private String dateCn;
    private String date;
    private String time;
    private String timeCn;
    private String start;
    private List<String> goby = new ArrayList<>();
    private String end;
    private int left;
    private String phone;

    public String getDateCn() {
        return dateCn;
    }

    public void setDateCn(String dateCn) {
        this.dateCn = dateCn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeCn() {
        return timeCn;
    }

    public void setTimeCn(String timeCn) {
        this.timeCn = timeCn;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public List<String> getGoby() {
        return goby;
    }

    public void setGoby(List<String> goby) {
        this.goby = goby;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
