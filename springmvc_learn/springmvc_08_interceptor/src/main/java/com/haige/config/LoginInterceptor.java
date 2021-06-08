package com.haige.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @className: com.haige.config-> LoginInterceptor
 * @description: 登录拦截
 * @author: cqh
 * @createDate: 2021-06-08 15:15
 * @version: 1.0
 * @todo:
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        if(request.getRequestURI().contains("login")){
            return true;
        }

        //session里有登录页面，就放行
        if(session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
