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
public class GetData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "haige123";

        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        // 向数据库发送对象
        Statement statement = connection.createStatement();
        // 编写sql
        String sql = "select * from user";
        //执行sql
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("id="+resultSet.getObject("id")+" name="+resultSet.getObject("name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
