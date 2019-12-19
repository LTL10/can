package com.xyh.can.controller;


import com.xyh.can.entity.LoginUser;
import com.xyh.can.entity.User;
import com.xyh.can.exception.MyException;
import com.xyh.can.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;
@Slf4j
@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/submitLogin")
    @ResponseBody
    public Map<String, Object> submitLogin(User user, HttpServletResponse httpServletResponse)  {
        System.out.println("我进来了");
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        //先执行登录验证的过滤操作,才会执行后面这些乱七八糟的异常
        //throw new MyException("测试自定义异常!");
        try {
            LoginUser loginUser = userService.login(user);
            if (loginUser != null) {
                httpServletResponse.setHeader("Authorization",loginUser.getToken());
                httpServletResponse.setHeader("Access-Control-Expose-Headers", "Authorization");
            }
            resultMap.put("loginUser",loginUser);
        }catch (MyException e) {
            resultMap.put("msg",e.getMessage());
        }catch (LockedAccountException e) {
            resultMap.put("msg",e.getMessage());
        }catch (IncorrectCredentialsException e) {
            resultMap.put("msg",e.getMessage());
        }catch (AccountException e) {
            resultMap.put("msg",e.getMessage());
        }
        return resultMap;
}

    /**
     *  测试用户是否登录
     * @return
     */
    @RequestMapping("/loginUrl")
    @ResponseBody
    //@RequiresPermissions("user:delete")
    public boolean loginUrl() {
        return true;
    }
}
