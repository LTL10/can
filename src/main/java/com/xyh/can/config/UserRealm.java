package com.xyh.can.config;


import com.xyh.can.entity.User;
import com.xyh.can.service.UserService;
import com.xyh.can.util.JwtToken;
import com.xyh.can.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  自定义的类
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;


    /**
     * 必须重写此方法，不然Shiro会报错
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 执行授权逻辑
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权逻辑");
        //SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        return null;
    }

    /**
     * 执行认证逻辑
     * @param token
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        String autoken = (String) token.getCredentials();

        // 解密获得username，用于和数据库进行对比
        String username = null;
        //这里工具类没有处理空指针等异常这里处理一下(这里处理科学一些)
        username = JwtUtil.getUsername(autoken);
        User user = userService.findUserName(username);
        if (username == null || !JwtUtil.verify(autoken, username,user.getU_Name())) {
            throw new IncorrectCredentialsException("token认证失败！");
        }
        return new SimpleAuthenticationInfo(user,autoken,
                getName());
    }
}
