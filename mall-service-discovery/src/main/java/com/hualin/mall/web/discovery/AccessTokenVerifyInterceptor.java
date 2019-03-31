/*
package com.hualin.mall.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*/
/**
 * Access Token拦截器
 * <p/>
 * Created by bysocket on 16/4/18.
 *//*

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    ValidationService validationService;
    private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        LOG.info("AccessToken executing ...");
        boolean flag = false;
        // token
        String accessToken = request.getParameter("token");
        if (StringUtils.isNotBlank(accessToken)) {
            // 验证
            ValidationModel v = validationService.verifyAccessToken(accessToken);
            // 时间过期
            // 用户验证
            if (v != null) {
                User user = userService.findById(v.getUid());
                if(user != null) {
                    request.setAttribute(CommonConst.PARAM_USER, user);
                    LOG.info("AccessToken SUCCESS ...  user:" + user.getUserName() + " - " + accessToken);
                    flag = true;
                }
            }
        }
        if (!flag) {
            response.setStatus(HttpStatus.FORBIDDEN.value());
            response.getWriter().print("AccessToken ERROR");
        }
        return flag;
    }
}*/
