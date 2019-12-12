package com.xyh.can.controller;

import com.xyh.can.service.Consumption_PageVoService;
import com.xyh.can.vo.Consumption_PageVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@Api(value = "账单",tags = "账单")
@RestController
public class Consumption_PageVoController {
    @Autowired
     Consumption_PageVoService consumption_pageVoService;

    @ApiOperation(value ="分页显示",notes = "分页显示账单")
    @GetMapping("/Consumption_PageVo")
    public Map<String,Object> Consumption_PageVo(Consumption_PageVo consumption_pageVo){
        System.out.println(consumption_pageVo.getPage());
        System.out.println(consumption_pageVo.getLimit());
        Map<String,Object> mapp=new HashMap<String,Object>();
        mapp.put("code",0);
        mapp.put("msg","");
        mapp.put("data",consumption_pageVoService.consumption_PageVo(consumption_pageVo));
        mapp.put("count",consumption_pageVoService.consumption_PageVoCount(consumption_pageVo));
        return mapp;
    }

}
