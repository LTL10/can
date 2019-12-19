package com.xyh.can.controller;

import com.xyh.can.mapper.ConsumptionMapper;
import com.xyh.can.service.ConsumptionService;
import com.xyh.can.vo.CanZhuoVo;
import com.xyh.can.vo.ConsumptionVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "消费清单表",tags = "消费清单表")
@RestController

public class ConsumptionController {
    @Autowired
    private ConsumptionService consumptionService;

    @ApiOperation(value = "账单总金额",notes = "根据账单编号查询菜名再根据菜名计算总金额")
    @GetMapping("/countMoney")
    public Double countMoney(Integer con_OrderId){
        Double count=consumptionService.countMoney(con_OrderId);
        return count;
    }
    @ApiOperation(value = "分页显示账单",notes = "显示所有消费清单表信息，根据点餐单号和消费清单号查询")
    @GetMapping("/ConsumptionPage")
    public Map<String,Object> ConsumptionPage(ConsumptionVo consumptionVo){
        Map<String,Object> mapp=new HashMap<String,Object>();
        mapp.put("data",consumptionService.ConsumptionPage(consumptionVo));
        mapp.put("code",0);
        mapp.put("msg","");
        mapp.put("count",consumptionService.countConsumption(consumptionVo));
        return mapp;
    }

}
