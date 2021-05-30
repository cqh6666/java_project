package com.haige.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @className: com.haige.test-> TransacTest
 * @description:
 * @author: cqh
 * @createDate: 2021-05-29 22:54
 * @version: 1.0
 * @todo:
 */
public class TransacTest {

    String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    String username = "root";
    String password = "haige123";

    Connection connection = null;
    @Test
    public void test(){
        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 连接数据库
            connection = DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(false);

            // 编写sql
            String sql_1 = "update account set money = money - 100 where name='h01'";
            connection.prepareStatement(sql_1).executeUpdate();

            // 开启事务
            String sql_2 = "update account set money = money - 100 where name='h02'";
            connection.prepareStatement(sql_2).executeUpdate();

            // 执行完就提交
            connection.commit();
            System.out.println("提交完成！");

            connection.close();
        } catch (Exception ex){
            try{
                // 回滚
                connection.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
