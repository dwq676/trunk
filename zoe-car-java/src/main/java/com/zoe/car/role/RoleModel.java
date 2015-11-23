package com.zoe.car.role;

import com.zoe.car.BaseModelSortSupport;
import com.zoe.commons.dao.model.Jsonable;
import com.zoe.commons.workbench.base.BaseModelSupport;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RoleModel
 *
 * @author Dai Wenqing
 * @date 2015/10/11
 */
@Component("com.zoe.car.role.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity
@Table(name = "car_role_info")
public class RoleModel extends BaseModelSortSupport {
    private String code;
    private String name;
    private String pCode;

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
}
