package com.zoe.car.message;

import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.orm.PageList;

/**
 * MessageService
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
public interface MessageService {
    /**
     * 获取附近的消息列表
     * 
     * @param longitude
     *            经度
     * @param latitude
     *            纬度
     * @param pageNum
     *            当前页
     * @param pageSize
     *            每页条数
     * @return 返回消息列表
     */
    PageList<MessageModel> searchMessageForNear(double longitude, double latitude, int pageSize, int pageNum);
}
