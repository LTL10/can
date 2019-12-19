package com.xyh.can.controller;

import com.xyh.can.entity.Menu;
import com.xyh.can.service.MenuService;
import com.xyh.can.util.MenuVo;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class MenuController {
     @Autowired
    private MenuService menuService;
     @ApiOperation(value = "菜单和菜系的联合表的分页",notes ="根据")
     @PostMapping("/menu")
public Map<String,Object> getall(MenuVo menuVo){
    Map<String,Object> map=new HashMap<String,Object>();
    map.put("code",0);
    map.put("msg","");
    map.put("data",menuService.fingpage(menuVo));
    map.put("count",menuService.count(menuVo));
    return  map;
 }
    @ApiOperation( value = "添加菜",notes = "根据菜Menu添加菜")
    @PostMapping("/addMenu")
    public boolean addMenu(Menu menu){
        int num= menuService.addMenu(menu);
        if (num>0){
            return true;
        }
        return  false;
    }
 @PostMapping("/update")
 public  boolean update(Menu menu){
         int num=menuService.update(menu);
         if(num>0){
             return  true;
         }
         return false;
 }
@PostMapping("/deteleMenu")
    public  boolean deteleMenu(Integer id){
         int num=menuService.deteleMenu(id);
    if(num>0){
        return  true;
    }
    return false;
}
    @PostMapping("/updateMenu")
    public  boolean updateMenu(Menu menu){
        int num=menuService.updateMenu(menu);
        if(num>0){
            return  true;
        }
        return false;
    }
@PostMapping("/insert")
public  boolean insert(Menu menu){
         int num=menuService.add(menu);
    if(num>0){
        return  true;
    }
    return false;

}
@PostMapping("/deteleone")
public boolean deteleone(int tid){
         int num=menuService.deleteone(tid);
    if(num>0){
        return  true;
    }
    return false;
}
    @PostMapping("/menuz")
    public List getalla(MenuVo menuVo){

        System.out.println(menuVo);
        System.out.println(menuService.fingpage(menuVo));
        return  menuService.fingpage(menuVo);
    }
}
