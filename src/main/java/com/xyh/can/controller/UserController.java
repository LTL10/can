package com.xyh.can.controller;

import com.xyh.can.entity.User;
import com.xyh.can.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
   @Autowired
    UserService userService;
    @ResponseBody
   @RequestMapping("/fy")
    public List<User> fenye(){
       return userService.fingpage();
   }
}
