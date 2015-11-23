package com.zoe.car.message;

import com.zoe.car.user.UserModel;

import java.util.List;

/**
 * MessageHelper
 *
 * @author Dai Wenqing
 * @date 2015/11/16
 */
public interface MessageHelper {

    void refresh();

    void add(MessageModel messageModel);

    /**
     * 搜索最热的
     * 
     * @param pageSize 每页总条数
     * @param pageNum 当前页
     * @return
     */
    List<MessageModel> search(int pageSize, int pageNum);

    /**
     * 搜索附近
     * @param geohash 经纬度HASH值
     * @param pageSize 每页总条数
     * @param pageNum 当前页
     * @return 消息列表
     */
    List<MessageModel> search(String geohash, int pageSize, int pageNum);

    /**
     * 搜索与我相关
     * @param userModel 用户
     * @param pageSize 每页总条数
     * @param pageNum 当前页
     * @return 消息列表
     */
    List<MessageModel> search(UserModel userModel, int pageSize, int pageNum);
}
