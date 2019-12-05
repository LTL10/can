package com.xyh.can.controller;
import com.xyh.can.entity.User;
import com.xyh.can.service.UserService;
import com.xyh.can.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
@RestController
@Api( value = "用户类",tags = "用户应用接口")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation( value = "用户分页查询",notes = "根据用户扩展类UserVo动态查询用户信息")
    @PostMapping("/fenye")
    public Map<String,Object> fenye(UserVo uservo){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",userService.fingpage(uservo));
        map.put("count",userService.Count(uservo));
        return map;
    }
    @ApiOperation( value = "添加用户",notes = "根据用户常用信息添加用户")
    @PostMapping("/tianjia")
    public boolean addUser(User user){
        int num= userService.addUser(user);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "修改用户",notes = "根据用户变动信息修改用户")
    @PostMapping("/xiugai")
    public boolean updateUser(User user){
        int num= userService.updateUSer(user);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "删除用户",notes = "根据用户Id删除用户")
    @PostMapping("/shanchu")
    public boolean delUser(Integer u_Id){
        int num= userService.delUser(u_Id);
        if (num>0){
            return true;
        }
        return  false;
    }
}
