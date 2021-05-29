package com.haige.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @className: com.haige.servlet-> ResponseServlet
 * @description:
 * @author: cqh
 * @createDate: 2021-05-28 20:40
 * @version: 1.0
 * @todo:
 */
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * - 获取下载文件的路径
         * - 下载的文件名是啥
         * - 想办法让浏览器能够支持下载我们需要的东西
         * - 获取下载文件的输入流
         * - 创建缓冲区
         * - 获取OutputStream对象，将FileOutputStream流写入到Buffer缓冲区
         * - 使用OutputStream将缓冲区中的数据输出到客户端
         */
        // 下载文件
        String realPath = this.getClass().getClassLoader().getResource("data.txt").getPath();
        System.out.println("下载数据的路径: "+ realPath);
        // 获取文件名
        String filename = realPath.substring(realPath.lastIndexOf("/")+ 1);
        // 下载文件头
        resp.setHeader("Content-disposition","attachment;filename="+ filename);

        FileInputStream inputStream = new FileInputStream(realPath);
        // 缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];

        ServletOutputStream outputStream = resp.getOutputStream();

        while((len=inputStream.read(buffer))>0){
            outputStream.write(buffer, 0, len);
        }

        inputStream.close();
        outputStream.close();

    }
}
