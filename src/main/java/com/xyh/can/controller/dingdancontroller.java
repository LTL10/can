package com.xyh.can.controller;

import com.xyh.can.entity.DianCan;
import com.xyh.can.entity.Order;
import com.xyh.can.entity.dingdanvo;
import com.xyh.can.service.dingdanservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "顾客订单",tags = "订单")
@RestController
public class dingdancontroller {
    @Autowired
    private dingdanservice dingdanservice;
    @ApiOperation(value = "顾客订单查询",notes = "aa")
    @PostMapping("/getdingdan")
    public  Map<String,Object> getdingdan(dingdanvo v){
        Map<String, Object> m=new HashMap<String, Object>();
        m.put("count",dingdanservice.getdingdancount(v));
        m.put("data",dingdanservice.getdingdan(v));
        m.put("code",0);
        m.put("msg","");
        return m;
    }
    @ApiOperation(value = "顾客订单查询后厨待制作",notes = "待制作")
    @PostMapping("/getdingdandaizuo")
    public  Map<String,Object> getdingdandaizuo(dingdanvo v){
        Map<String, Object> m=new HashMap<String, Object>();
        m.put("count",dingdanservice.getdingdandaizuocount(v));
        m.put("data",dingdanservice.getdingdandaizuo(v));
        m.put("code",0);
        m.put("msg","");
        return m;
    }
    @ApiOperation(value = "顾客订单查询等待服务员上菜",notes = "待上菜")
    @PostMapping("/getdingdandaishangcai")
    public  Map<String,Object> getdingdandaishangcai(dingdanvo v){
        Map<String, Object> m=new HashMap<String, Object>();
        m.put("count",dingdanservice.getdingdandaishangcaicount(v));
        m.put("data",dingdanservice.getdingdandaishangcai(v));
        m.put("code",0);
        m.put("msg","");
        return m;
    }
    @ApiOperation(value = "顾客订单查询服务员未上菜",notes = "待上菜")
    @PostMapping("/getweishangcai")
    public  Map<String,Object> getweishangcai(dingdanvo v){
        Map<String, Object> m=new HashMap<String, Object>();
        m.put("count",dingdanservice.getweishangcaicount(v));
        m.put("data",dingdanservice.getweishangcai(v));
        m.put("code",0);
        m.put("msg","");
        return m;
    }
    @ApiOperation(value = "修改菜的状态",notes = "修改菜的状态")
    @PostMapping("/updatestate")
    public String updatestate(DianCan d){
        int i=dingdanservice.updatestate(d);
        if(i>0){
            return "成功";
        }else{
            return "失败";
        }
    }
    @ApiOperation(value = "添加点餐信息及菜单",notes = "添加订单")
    @PostMapping("/addordercaidan")
    public String addordercaidan(Order o, DianCan d){

        try {

            dingdanservice.addOrderDianCan(o,d);
                        return "成功";
                 } catch (Exception e) {
                       e.printStackTrace();
                        return "失败";
                     }
    }
    @ApiOperation(value = "加菜",notes = "加菜")
    @PostMapping("/addcai")
    public String  addcai(DianCan d){

        int i=dingdanservice.jiacai(d);
        if (i>0){
            return "加菜成功";
        }else{
            return "加菜失败";
        }
    }
}
