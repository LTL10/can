package com.xyh.can.controller;

import com.xyh.can.service.CanZhuoService;
import com.xyh.can.vo.CanZhuoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Api(value = "餐桌类")
@RestController
/*@RequiresAuthentication*/
public class canZhuoController {

    @Autowired
    private CanZhuoService canZhuoService;
    @ApiOperation(value = "餐桌的分页",notes = "将所有的餐桌分页显示")
    @GetMapping("/canZhuoPage")
    public Map<String,Object> canZhuoPage(CanZhuoVo canZhuoVo){
        Map<String,Object> mapp=new HashMap<String,Object>();
        mapp.put("data",canZhuoService.CanZhuoPage(canZhuoVo));
        mapp.put("code",0);
        mapp.put("msg","");
        mapp.put("count",canZhuoService.CanZhuoCount(canZhuoVo));
        return mapp;
    }
    @ApiOperation(value ="修改餐桌的状态",notes = "根据传入的状态值修改餐桌的状态")
    @PostMapping("/canZhuoUpdate")
    public Integer canZhuoUpdate(CanZhuoVo canZhuoVo){
        int can=canZhuoService.CanZhuoUpdate(canZhuoVo);
        if(can>1){
            return 1;
        }
        return 0;
    }
}
