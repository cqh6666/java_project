package com.haige.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.haige.servlet-> ReadServlet
 * @description:
 * @author: cqh
 * @createDate: 2021-05-28 19:53
 * @version: 1.0
 * @todo:
 */
public class ReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        ServletContext context = this.getServletContext();

        String username = (String) context.getAttribute("username");

        resp.getWriter().println("名字:" + username);
    }
}
