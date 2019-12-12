package com.xyh.can.mapper;

import com.xyh.can.entity.DianCan;
import com.xyh.can.entity.Order;
import com.xyh.can.entity.dingdanvo;

import java.util.List;
import java.util.Map;

public interface dingdanmapper {
    List<Map> getdingdan(dingdanvo v);//查询顾客订单
    int getdingdancount(dingdanvo v);//查询顾客点菜数量
    int updatestate(DianCan d);//修改菜的状态
    int addOrder(Order o);//添加点餐信息
    int addDianCan(DianCan d);//添加所点菜的信息
    int jiacai(DianCan d);//加菜
    List<Map> getdingdandaizuo(dingdanvo v);//待做菜单
    int getdingdandaizuocount(dingdanvo v);
    List<Map> getdingdandaishangcai(dingdanvo v);//待上菜单
    int getdingdandaishangcaicount(dingdanvo v);
    List<Map> getweishangcai(dingdanvo v);
    int getweishangcaicount(dingdanvo v);
    int deldingdan(DianCan d);
}
