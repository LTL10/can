package com.xyh.can.service.impl;

import com.xyh.can.entity.DianCan;
import com.xyh.can.entity.Order;
import com.xyh.can.entity.dingdanvo;
import com.xyh.can.mapper.dingdanmapper;
import com.xyh.can.service.dingdanservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
public class dingdanserviceimpl implements dingdanservice {
    @Autowired
    private dingdanmapper dingdanmapper;
    @Override
    public List<Map> getdingdan(dingdanvo v) {
        return dingdanmapper.getdingdan(v);
    }

    @Override
    public int getdingdancount(dingdanvo v) {
        return dingdanmapper.getdingdancount(v);
    }

    @Override
    public int updatestate(DianCan d) {
        return dingdanmapper.updatestate(d);
    }

    @Override
    @Transactional
    public void addOrderDianCan(Order o, DianCan d) {
        dingdanmapper.addOrder(o);
        dingdanmapper.addDianCan(d);
    }

    @Override
    public int jiacai(DianCan d) {
        return dingdanmapper.jiacai(d);
    }

    @Override
    public List<Map> getdingdandaizuo(dingdanvo v) {
        return dingdanmapper.getdingdandaizuo(v);
    }

    @Override
    public List<Map> getdingdandaishangcai(dingdanvo v) {
        return dingdanmapper.getdingdandaishangcai(v);
    }

    @Override
    public List<Map> getweishangcai(dingdanvo v) {
        return dingdanmapper.getweishangcai(v);
    }

    @Override
    public int getdingdandaizuocount(dingdanvo v) {
        return dingdanmapper.getdingdandaizuocount(v);
    }

    @Override
    public int getdingdandaishangcaicount(dingdanvo v) {
        return dingdanmapper.getdingdandaishangcaicount(v);
    }

    @Override
    public int getweishangcaicount(dingdanvo v) {
        return dingdanmapper.getweishangcaicount(v);
    }

    @Override
    public int deldingdan(DianCan d) {
        return dingdanmapper.deldingdan(d);
    }


}
