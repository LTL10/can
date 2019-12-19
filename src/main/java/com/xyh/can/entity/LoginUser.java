package com.xyh.can.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.stereotype.Component;

import java.util.List;
import lombok.Data;
/**
 * LoginUser:登录注册LoginUser传参实体(带验证码)
 *
 * @author zhangxiaoxiang
 * @date: 2019/05/23
 */

@JsonInclude(JsonInclude.Include.NON_NULL)//标记是jackson包提供的json序列化方法

public class LoginUser {

    /**
     * 验证码
     */
    private String phoneCode;
    /**
     * 用户
     */
    private User user;

    /**
     * 用户token验证(header的键名)
     */
    private String token;
    /**
     * 用户所拥有的权限
     */
   // private Map<String,Object> prems;
    private List<String> prems;

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getPrems() {
        return prems;
    }

    public void setPrems(List<String> prems) {
        this.prems = prems;
    }
}
