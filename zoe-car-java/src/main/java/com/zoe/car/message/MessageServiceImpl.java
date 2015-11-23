package com.zoe.car.message;

import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.util.Geo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * MessageServiceImpl
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
@Service("com.zoe.car.message.service")
public class MessageServiceImpl implements MessageService {

    @Value("${commons.near.radius}")
    private int radius;
    @Autowired
    private MessageDao messageDao;

    @Override
    public PageList<MessageModel> searchMessageForNear(double longitude, double latitude, int pageSize, int pageNum) {
        double[] around = Geo.getAround(latitude, longitude, radius);
        return messageDao.searchMessageForNear(new double[] { latitude, longitude }, around, pageSize, pageNum);
    }
}
