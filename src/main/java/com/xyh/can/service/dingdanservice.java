package com.xyh.can.service;

import com.xyh.can.entity.Canche;
import com.xyh.can.entity.DianCan;
import com.xyh.can.entity.Order;
import com.xyh.can.entity.dingdanvo;

import java.util.List;
import java.util.Map;

public interface dingdanservice {
    List<Map> getdingdan(dingdanvo v);
    int getdingdancount(dingdanvo v);
    int updatestate(DianCan d);
    void addOrderDianCan(Order o,DianCan d);
    int jiacai(DianCan d);
    List<Map> getdingdandaizuo(dingdanvo v);
    List<Map> getdingdandaishangcai(dingdanvo v);//待上菜单
    List<Map> getweishangcai(dingdanvo v);
    int getdingdandaizuocount(dingdanvo v);
    int getdingdandaishangcaicount(dingdanvo v);
    int getweishangcaicount(dingdanvo v);
    int deldingdan(DianCan d);
    List<Map> getcanche(Canche c);
    int updatecanchenum(Canche c);
    int delcanche(Canche c);
    int addcanche(Canche c);
    Map calldingdan(Order o);

}
