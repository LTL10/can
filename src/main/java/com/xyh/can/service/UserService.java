package com.xyh.can.service;

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
}
