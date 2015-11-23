package com.zoe.car;

import com.zoe.commons.dao.model.Jsonable;
import com.zoe.commons.workbench.base.BaseModelSupport;
import com.zoe.commons.workbench.base.SupperClass;
import com.zoe.commons.workbench.ui.Automation;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * BaseModelSortSupport
 *
 * @author Dai Wenqing
 * @date 2015/10/11
 */
@MappedSuperclass()
@SupperClass(packName = "com.zoe.car")
public class BaseModelSortSupport extends BaseModelSupport implements Automation {
    private int sort;

    @Column(name = "sort")
    @Jsonable
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
