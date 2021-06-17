package com.haige.config;

import com.haige.pojo.User;
import com.haige.service.UserService;
import com.haige.service.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @className: com.haige.config-> UserRealm
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 17:04
 * @version: 1.0
 * @todo:
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("=========执行了授权doGetAuthorizationInfo==========");
        // 增加授权
        Subject subject = SecurityUtils.getSubject();
        // 拿到User对象
        User currentUser = (User) subject.getPrincipal();
        // 设置当前用户的权限
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission(currentUser.getPerms());

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("=========执行了认证doGetAuthorizationInfo==========");

        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;

        // 连接数据库查询
        User user = userService.queryUserByName(userToken.getUsername());

        if(user==null){
            // 抛出UnknownAccountException
            return null;
        }

        // 密码认证
        return new SimpleAuthenticationInfo(user, user.getPwd(),"");
    }
}
