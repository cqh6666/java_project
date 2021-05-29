package com.haige.filter;

import com.haige.utils.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.haige.filter-> LoginFilter
 * @description:
 * @author: cqh
 * @createDate: 2021-05-29 17:46
 * @version: 1.0
 * @todo:
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        Object user_session = request.getSession().getAttribute(Constant.USER_SESSION);

        if (user_session == null){
            response.sendRedirect("/error.jsp");
        }

        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
