package com.haige.dao;

import com.haige.pojo.User;
import com.haige.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: com.haige-> TestMybatis
 * @description:
 * @author: cqh
 * @createDate: 2021-05-30 17:57
 * @version: 1.0
 * @todo:
 */
public class TestMybatis {
    @Test
    public void getUserList() {
        // 获取sqlsession
        SqlSession sqlSession = null;
        // 用户列表
        List<User> userList = null;
        // 方式二
//       List<User> userList = sqlSession.selectList("com.com.com.haige.dao.UserDao.getUserList");

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            // 方式一 getMapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userList = userMapper.getUserList();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
        for (User user : userList) {
            System.out.println(user);
        }

    }
    @Test
    public void GetUserByIdTest(){
        // 获取sqlsession
        SqlSession sqlSession = null;
        // 用户
        User user = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            user = userMapper.getUserById(1);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }

        System.out.println(user);
    }

    @Test
    public void addUser(){
        // 获取sqlsession
        SqlSession sqlSession = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.addUser(new User(8,"王老六","123324"));

            if (res>0){
                System.out.println("插入成功i你！");
            }
            //提交事务
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            assert sqlSession != null;
            sqlSession.close();
        }

    }

    @Test
    public void addUser2(){
        // 获取sqlsession
        SqlSession sqlSession = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            Map<String, Object> map = new HashMap<String,Object>();
            map.put("userid",5);
            map.put("username","cpdd");
            map.put("password","1233321");
            int res = userMapper.addUser2(map);

            if (res>0){
                System.out.println("插入成功i你！");
            }
            //提交事务
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            assert sqlSession != null;
            sqlSession.close();
        }

    }

    @Test
    public void updateUser(){
        // 获取sqlsession
        SqlSession sqlSession = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.updateUser(new User(4,"王老四","1232324"));

            if (res>0){
                System.out.println("修改成功i你！");
            }
            //提交事务
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            assert sqlSession != null;
            sqlSession.close();
        }

    }

    @Test
    public void deleteUser(){
        // 获取sqlsession
        SqlSession sqlSession = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.deleteUser(4);

            if (res>0){
                System.out.println("删除成功！");
            }
            //提交事务
            sqlSession.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            assert sqlSession != null;
            sqlSession.close();
        }

    }

    @Test
    public void getUserLike(){
        // 获取sqlsession
        SqlSession sqlSession = null;
        // 用户
        List<User> userList = null;

        try {
            sqlSession = MyBatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userList = userMapper.getUserLike("%三%");
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            assert sqlSession != null;
            sqlSession.close();
        }

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
