package com.xyh.can.service.impl;

import com.xyh.can.entity.User;
import com.xyh.can.mapper.UserMapper;
import com.xyh.can.service.UserService;
import com.xyh.can.vo.UserVo;
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
}
