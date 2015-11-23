package com.zoe.car.user.suggest;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.car.user.UserModel;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * SuggestModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.user.suggest.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_user_suggest")
public class SuggestModel extends BaseModelSortSupport {
    private UserModel userModel;
    private String content;
    private int readStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Jsonable
    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
    @Column(name = "content")
    @Jsonable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "readStatus")
    @Jsonable
    public int getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(int readStatus) {
        this.readStatus = readStatus;
    }
}
