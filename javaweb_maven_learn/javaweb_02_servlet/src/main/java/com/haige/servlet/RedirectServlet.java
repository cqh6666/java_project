package com.haige.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.haige.servlet-> VerticalServlet
 * @description:
 * @author: cqh
 * @createDate: 2021-05-28 21:08
 * @version: 1.0
 * @todo:
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 重定向

        /*
        resp.setHeader()
        resp.setStatus(302)
         */
        resp.sendRedirect("/s2/getc");
    }
}
