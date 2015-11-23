package com.zoe.car.user.order;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.car.user.notice.NoticeModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * OrderModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.order.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_order")
public class OrderModel extends BaseModelSortSupport {
    private NoticeModel noticeModel;
    private UserModel userModel;
    private int type;
    private int status;

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
    @JoinColumn(name = "notice_id")
    @Jsonable
    public NoticeModel getNoticeModel() {
        return noticeModel;
    }

    public void setNoticeModel(NoticeModel noticeModel) {
        this.noticeModel = noticeModel;
    }
    @Column(name = "type")
    @Jsonable
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    @Column(name = "status")
    @Jsonable
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
