package com.zoe.car.area;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.commons.dao.model.Jsonable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AreaModel
 *
 * @author Dai Wenqing
 * @date 2015/10/12
 */
@Component("com.zoe.car.area.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity(name = "com.zoe.car.area.entity")
@Table(name = "car_area_info")
public class AreaModel extends BaseModelSortSupport {
    private String code;
    private String name;
    private String pCode;
    private int level;

    @Column(name = "code")
    @Jsonable
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name")
    @Jsonable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "p_code")
    @Jsonable
    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    @Column(name = "level")
    @Jsonable
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
