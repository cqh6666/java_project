package com.haige.test;

import java.sql.*;

/**
 * @className: com.haige.dao-> TestJdbc
 * @description:
 * @author: cqh
 * @createDate: 2021-05-29 19:48
 * @version: 1.0
 * @todo:
 */
public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "haige123";

        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 连接数据库
            Connection connection = DriverManager.getConnection(url, username, password);
            // 编写sql
            String sql = "insert into user(id, name, pwd) values(?,?,?);";
            //预编译
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 35);
            preparedStatement.setString(2, "Is");
            preparedStatement.setString(3, "123123");

            // 执行sql
            int i = preparedStatement.executeUpdate();

            if (i>0){
                System.out.println("插入成功");
            }

            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
