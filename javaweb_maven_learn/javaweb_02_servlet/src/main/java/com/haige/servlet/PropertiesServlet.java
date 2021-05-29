package com.haige.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @className: com.haige.servlet-> PropertiesServlet
 * @description:
 * @author: cqh
 * @createDate: 2021-05-28 20:16
 * @version: 1.0
 * @todo:
 */
public class PropertiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        Properties p = new Properties();
        // 读取properties
        p.load(is);
        String username = p.getProperty("username");
        resp.getWriter().println(username);
    }
}
