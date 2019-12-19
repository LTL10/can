package com.xyh.can.controller;

import com.xyh.can.entity.Cuisine;
import com.xyh.can.service.CuisineService;
import com.xyh.can.util.CuisineVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "菜系表",tags = "菜系表")
//@RequiresAuthentication
public class CuisineController {
@Autowired
    private CuisineService cuisineService;
      @ApiOperation(value = "菜系表分页",notes = "分页显示 id 和菜系名称2个字段")
      @PostMapping("/Cfenye")
      public Map<String,Object> tionPage(CuisineVo cuisineVo){
          Map<String,Object> map=new HashMap<String,Object>();
          map.put("data",cuisineService.Cfenye(cuisineVo));
          map.put("code",0);
          map.put("msg","");
          map.put("count",cuisineService.Ccount());
          return map;
      }
      @ApiOperation(value = "菜系表添加",notes = "菜系表根据主键id递增添加")
      @PostMapping("/Ctianjia")
     public boolean add(Cuisine cuisine){
          int num=cuisineService.Cadd(cuisine);//1
          if (num>0){
              return true;
          }
          return  false;
      }
      @ApiOperation(value = "菜系表修改",notes = "菜系表根据id来进行修改")
    @PostMapping("/Cupdate")
    public  boolean update(Cuisine cuisine){
        int num=cuisineService.Cupdate(cuisine);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation(value = "菜系表删除",notes = "菜系表根据id来进行删除")
    @PostMapping("/delC")
    public  boolean delC(Integer id){
        int num=cuisineService.delC(id);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation(value = "全部菜系",notes = "获取全部菜系")
    @PostMapping("/cxAllCuisine")
    public List<Cuisine> cxAll(){
          System.out.println("ddddd");
          System.out.println(cuisineService.cxAll().toString());
        return  cuisineService.cxAll();
    }
}
