package com.xyh.can.controller;

import com.xyh.can.entity.Menu;
import com.xyh.can.service.MenuService;
import com.xyh.can.util.MenuVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MenuController {
     @Autowired
    private MenuService menuService;
     @ApiOperation(value = "菜单和菜系的联合表的分页",notes ="根据")

     @GetMapping("/menu")
public Map<String,Object> getall(MenuVo menuVo){
    Map<String,Object> map=new HashMap<String,Object>();
    map.put("data",menuService.fingpage(menuVo));
    map.put("code",0);
    map.put("msg","");
    map.put("count",menuService.count());
    return  map;
 }
 @RequestMapping("/update")
 public  boolean update(Menu menu){
         int num=menuService.update(menu);
         if(num>0){
             return  true;
         }
         return false;
 }
@RequestMapping("/detele")
    public  boolean delete(int id){
         int num=menuService.delete(id);
    if(num>0){
        return  true;
    }
    return false;
}
@RequestMapping("/insert")
public  boolean insert(Menu menu){
         int num=menuService.add(menu);
    if(num>0){
        return  true;
    }
    return false;

}
@RequestMapping("/deteleone")
public boolean deteleone(int tid){
         int num=menuService.deleteone(tid);
    if(num>0){
        return  true;
    }
    return false;
}
}
