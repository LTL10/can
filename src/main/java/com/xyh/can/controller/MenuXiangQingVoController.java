package com.xyh.can.controller;

import com.xyh.can.service.MenuXiangQingVoService;
import com.xyh.can.vo.MenuXiangQingVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "菜详情",tags = "菜详情")
@RestController
public class MenuXiangQingVoController {
    @Autowired
     MenuXiangQingVoService menuXiangQingVoService;

    @ApiOperation(value = "显示菜单详情",notes = "显示当前菜单的菜")
    @GetMapping("/MenuXiangQingVo_Page")
    public Map<String,Object> MenuXiangQingVo_Page(MenuXiangQingVo menuXiangQingVo){
        Map<String,Object> mapp=new HashMap<String,Object>();
        mapp.put("code",0);
        mapp.put("msg","");
        mapp.put("data",menuXiangQingVoService.MenuXiangQingVo_Page(menuXiangQingVo));
        mapp.put("count",menuXiangQingVoService.MenuXiangQingVo_Count(menuXiangQingVo));
        return mapp;
    }

}
