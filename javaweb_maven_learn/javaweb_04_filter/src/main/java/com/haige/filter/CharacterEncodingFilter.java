package com.haige.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @className: com.haige.filter-> CharacterEncodingFilter
 * @description: 字符过滤器
 * @author: cqh
 * @createDate: 2021-05-29 16:50
 * @version: 1.0
 * @todo:
 */
public class CharacterEncodingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CEF已经初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        System.out.println("过滤器执行前...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤器执行后...");
    }

    @Override
    public void destroy() {
        System.out.println("CEF已经销毁");

    }
}
