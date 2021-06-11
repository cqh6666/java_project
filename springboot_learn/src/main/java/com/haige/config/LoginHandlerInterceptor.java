package com.haige.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.haige.config-> LoginHandlerInceptor
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 20:18
 * @version: 1.0
 * @todo:
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object loginUserInfo = request.getSession().getAttribute("loginUserInfo");
        if(loginUserInfo == null){
            //没有登录
            request.setAttribute("msg", "没有权限，请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{
            return true;
        }
    }
}
