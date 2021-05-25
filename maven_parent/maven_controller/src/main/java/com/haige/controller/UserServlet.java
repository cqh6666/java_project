package com.haige.controller;

import com.haige.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.haige.controller-> UserServlet
 * @description:
 * @author: cqh
 * @createDate: 2021-05-25 20:34
 * @version: 1.0
 * @todo:
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UserServlet test..");
        // 调用service
        UserService.testService();
    }
}
