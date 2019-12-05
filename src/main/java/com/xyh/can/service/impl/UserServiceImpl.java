package com.xyh.can.service.impl;

import com.xyh.can.entity.User;
import com.xyh.can.mapper.UserMapper;
import com.xyh.can.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> fingpage() {
        return userMapper.fingpage();
    }
}
