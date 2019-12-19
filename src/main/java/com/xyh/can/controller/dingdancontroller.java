package com.xyh.can.controller;

import com.xyh.can.entity.Canche;
import com.xyh.can.entity.DianCan;
import com.xyh.can.entity.Order;
import com.xyh.can.entity.dingdanvo;
import com.xyh.can.service.dingdanservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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
        System.out.println(m);
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
    @ApiOperation(value = "删除订单",notes = "删除")
    @PostMapping("/deldingdan")
    public String deldingdan(DianCan d){
        int i=dingdanservice.deldingdan(d);
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

    @PostMapping("/calldingdan")
    public  Map<String,Object> calldingdan(Order o){
        Map<String, Object> m=new HashMap<String, Object>();

        System.out.println(dingdanservice.calldingdan(o));
        return dingdanservice.calldingdan(o);

    }
    @PostMapping("/getcanche")
    public List getcanche(Canche c){

        return dingdanservice.getcanche(c);
    } @ApiOperation(value = "修改菜的数量",notes = "修改菜的数量")
    @GetMapping("/updatecanchenum")
    public int updatecanchenum(Canche c){
        System.out.println(c);
        return dingdanservice.updatecanchenum(c);
//        System.out.println(i);
//        if(i>0){
//            return "修改成功";
//        }else{
//            return "修改失败";
//        }
    }
    @ApiOperation(value = "加入餐车",notes = "加入餐车")
    @GetMapping("/addcanche")
    public int addcanche(Canche c){
        System.out.println(c);
        return dingdanservice.addcanche(c);
//        System.out.println(i);
//        if(i>0){
//            return "修改成功";
//        }else{
//            return "修改失败";
//        }
    }
    @ApiOperation(value = "删除餐车",notes = "删除餐车")
    @PostMapping("/delcanche")
    public int delcanche(Canche c){
        System.out.println(c);
        return dingdanservice.delcanche(c);
//        System.out.println(i);
//        if(i>0){
//            return "修改成功";
//        }else{
//            return "修改失败";
//        }
    }
}
