package com.zoe.car.message;

import com.zoe.commons.dao.orm.PageList;

/**
 * MessageDao
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
public interface MessageDao {
    /**
     * 查找附近的拼车消息
     * 
     * @param location
     *            当前地理位置，包括longitude,latitude
     * @param around
     *            某个半径范围内的最小经纬度,最大经纬度，从左至右分别是最最小纬度，最小经度，最大纬度，最大经度
     * @param pageSize
     *            每页条数
     * @param pageNum
     *            当前页数
     * @return 返回消息列表
     */
    PageList<MessageModel> searchMessageForNear(double[] location, double[] around, int pageSize, int pageNum);
}
