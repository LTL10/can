package com.xyh.can.service;

import com.xyh.can.entity.LoginUser;
import com.xyh.can.entity.User;
import com.xyh.can.vo.UserVo;

import java.util.List;

public interface UserService {
    public List<User> fingpage(UserVo uservo);//用戶分页
    public Integer Count(UserVo uservo);//查询总条数
    public Integer addUser(User user);//添加用户
    public Integer updateUSer(User user);//修改用户
    public Integer delUser(Integer u_id);//删除用户
    public Integer addUserRoles(Integer u_Id,Integer r_Id);//用户赋予角色
    public Integer updateUserRoles(Integer u_Id,Integer r_Id);//用户变更角色
    public Integer czmima(Integer u_Id);//重置密码
    public Integer suoding(Integer u_Id);//锁定用户
    public Integer jiesuo(Integer u_Id);//解锁用户
    public Integer delUserAll(String uid);//批量删除用户
    public User findUserName(String user_name);  //通过用户名查找
    LoginUser login(User user); //用户登录


}
