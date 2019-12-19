package com.xyh.can.service.impl;

import com.xyh.can.entity.LoginUser;
import com.xyh.can.entity.User;
import com.xyh.can.exception.MyException;
import com.xyh.can.mapper.UserMapper;
import com.xyh.can.service.UserService;
import com.xyh.can.util.JwtUtil;
import com.xyh.can.util.MD5Untils;
import com.xyh.can.vo.UserVo;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.LockedAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> fingpage(UserVo uservo) {
        return userMapper.fingpage(uservo);
    }

    @Override
    public Integer Count(UserVo uservo) {
        return userMapper.Count(uservo);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Integer updateUSer(User user) {
        return userMapper.updateUSer(user);
    }

    @Override
    public Integer delUser(Integer u_id) {
        return userMapper.delUser(u_id);
    }

    @Override
    public Integer addUserRoles(Integer u_Id, Integer r_Id) {
        return userMapper.addUserRoles(u_Id,r_Id);
    }

    @Override
    public Integer updateUserRoles(Integer u_Id, Integer r_Id) {
        return userMapper.updateUserRoles(u_Id,r_Id);
    }

    @Override
    public Integer czmima(Integer u_Id) {
        return userMapper.czmima(u_Id);
    }

    @Override
    public Integer suoding(Integer u_Id) {
        return userMapper.suoding(u_Id);
    }

    @Override
    public Integer jiesuo(Integer u_Id) {
        return userMapper.jiesuo(u_Id);
    }

    @Override
    public Integer delUserAll(String uid) {
        return userMapper.delUserAll(uid);
    }

    @Override
    public User findUserName(String user_name) {
        return userMapper.findUserName(user_name);
    }

    @Override
    public LoginUser login(User user) {
        User user1 = null;

        user1 = userMapper.findUserName(user.getU_Name());

        if (user1 == null) {
            throw new MyException("该用户名不存在,请检查后再登录!(๑¯◡¯๑)");
        }
        if (!MD5Untils.verify(user.getU_Password(),user1.getU_Password())) {
            throw new AccountException("密码错误，请仔细一点哦(`･ω･′)ゞ");
        }
        if (user1.getU_IsLockout().equals("是")){
            throw new LockedAccountException("用户被锁定,请联系管理员!๐·°(৹˃̵﹏˂̵৹)°·๐");
        }
        //Map<String,Object> map = new HashMap<>();

        //map.put("prems",rolePre);
        LoginUser loginUser=new LoginUser();
        //根据电话号码和密码加密生成token
        String token = JwtUtil.sign(user1.getU_Name(), user1.getU_Password());
        loginUser.setToken(token);
        loginUser.setUser(user1);
        return loginUser;
    }

}
