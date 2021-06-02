package com.haige;

import java.sql.*;

/**
 * @className: com.haige-> LinkDatabase
 * @description:
 * @author: cqh
 * @createDate: 2021-05-28 14:25
 * @version: 1.0
 * @todo:
 */
public class LinkDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8","root","haige123");
        String sql = "select * from user";
        Statement statement = connection.createStatement();
        ResultSet res = statement.executeQuery(sql);
        while(res.next()){
            System.out.println(res.getString("name") +"/" + res.getString("pwd"));
        }


        connection.close();

    }
}
