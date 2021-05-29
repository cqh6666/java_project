package com.haige.servlet;

import com.haige.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.haige.servlet-> LogoutServlet
 * @description: 注销
 * @author: cqh
 * @createDate: 2021-05-29 17:40
 * @version: 1.0
 * @todo:
 */
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user_session = req.getSession().getAttribute(Constant.USER_SESSION);

        if ( user_session != null){
            req.getSession().removeAttribute(Constant.USER_SESSION);
        }
        resp.sendRedirect("/login.jsp");

    }
}
