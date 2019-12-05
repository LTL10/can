package com.xyh.can.mapper;

import com.xyh.can.entity.User;
import com.xyh.can.vo.UserVo;

import java.util.List;

public interface UserMapper {
    public List<User> fingpage(UserVo uservo);//用戶分页
    public Integer Count(UserVo uservo);//查询总条数
    public Integer addUser(User user);//添加用户
    public Integer updateUSer(User user);//修改用户
    public Integer delUser(Integer u_id);//删除用户
}
