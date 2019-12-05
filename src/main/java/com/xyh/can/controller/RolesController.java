package com.xyh.can.controller;

import com.xyh.can.entity.Roles;
import com.xyh.can.entity.User;
import com.xyh.can.service.RolesService;
import com.xyh.can.service.UserService;
import com.xyh.can.vo.RolesVo;
import com.xyh.can.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api( value = "角色类",tags = "角色应用接口")
public class RolesController {
    @Autowired
    RolesService rolesService;
    @ApiOperation( value = "角色分页查询",notes = "根据角色扩展类RolesVo动态查询角色信息")
    @PostMapping("/fenyeRoles")
    public Map<String,Object> fenye(RolesVo rolesVo){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",rolesService.fingpage(rolesVo));
        map.put("count",rolesService.Count(rolesVo));
        return map;
    }
    @ApiOperation( value = "添加角色",notes = "根据角色常用信息添加角色")
    @PostMapping("/tianjiaRoles")
    public boolean addUser(Roles roles){
        int num= rolesService.addRoles(roles);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "修改角色",notes = "根据角色变动信息修改角色")
    @PostMapping("/xiugaiRoles")
    public boolean updateUser(Roles roles){
        int num= rolesService.updateRoles(roles);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "删除角色",notes = "根据角色Id删除角色")
    @PostMapping("/shanchuRoles")
    public boolean delUser(Integer r_Id){
        int num= rolesService.delRoles(r_Id);
        if (num>0){
            return true;
        }
        return  false;
    }
}
