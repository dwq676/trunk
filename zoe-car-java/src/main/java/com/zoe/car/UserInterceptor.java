package com.zoe.car;

import com.zoe.commons.ctrl.Forward;
import com.zoe.commons.ctrl.Interceptor;
import com.zoe.commons.ctrl.Invocation;
import com.zoe.commons.ctrl.context.Request;
import com.zoe.commons.ctrl.context.Session;
import com.zoe.commons.ctrl.http.context.Cookie;
import com.zoe.commons.util.Generator;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserInterceptor
 *
 * @author Dai Wenqing
 * @date 2015/11/11
 */
public class UserInterceptor implements Interceptor {
    @Autowired
    private Request request;
    @Autowired
    private Forward forward;
    @Autowired
    private Cookie cookie;
    @Autowired
    private Session session;
    @Autowired
    private Generator generator;

    @Override
    public int getSort() {
        return 10;
    }

    @Override
    public Object execute(Invocation invocation) throws Exception {
        String token = cookie.get("token");
        /**
         * 客户端的cookie已经过期了，表明已经一个月的过期时间已经到期，跳转到登录页面
         */
        if (token == null) {
            forward.redirect("/car/user/v/login");
        } else {
            /**
             * 未过期重新修改cookie过期时间
             */
            if (session.get(token) != null) {
                cookie.add("token", generator.random(32), "", 21600 * 60);
            }
        }
        return "";
    }
}
