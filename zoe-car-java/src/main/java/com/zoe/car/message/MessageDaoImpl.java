package com.zoe.car.message;

import com.zoe.commons.dao.orm.PageList;
import com.zoe.commons.dao.orm.hibernate.HibernateOrm;
import com.zoe.commons.dao.orm.hibernate.HibernateQuery;
import org.hibernate.procedure.ParameterMisuseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * MessageDaoImpl
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
@Repository("com.zoe.car.message.dao")
public class MessageDaoImpl implements MessageDao {
    @Autowired
    private HibernateOrm hibernateOrm;

    @Override
    public PageList<MessageModel> searchMessageForNear(double[] location, double[] around, int pageSize, int pageNum) {
        if (location.length < 2)
            throw new ParameterMisuseException("参数个数不对，请检查location，必须包含经纬度");
        if (location.length < 4)
            throw new ParameterMisuseException(("参数个数不对,请检查around参数"));
        HibernateQuery hibernateQuery = new HibernateQuery(MessageModel.class);
        hibernateQuery.where("latitude <> 0").where("latitude > " + around[0]).where("longitude > " + around[1]).where("latitude <" + around[2])
                .where("longitude <" + around[3])
                .order("by ACOS(SIN((" + location[0] + " * 3.1415) / 180 ) * SIN((latitude * 3.1415) / 180 )   \n" + " +COS((" + around[0]
                        + " * 3.1415) / 180 ) * COS((latitude * 3.1415) / 180 )   \n" + " *COS((" + around[1]
                        + " * 3.1415) / 180 - (longitude * 3.1415) / 180 ) ) * 6380  asc")
                .size(pageSize).page(pageNum);
        return  hibernateOrm.query(hibernateQuery, new Object[] {});
    }
}
