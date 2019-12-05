package com.xyh.can.service;

import com.xyh.can.mapper.ConsumptionMapper;
import com.xyh.can.vo.ConsumptionVo;

import java.util.List;

public interface ConsumptionService {
    public Double countMoney(Integer con_OrderId);//消费总金额
    public List<ConsumptionVo> ConsumptionPage(ConsumptionVo consumptionVo);
    public Integer countConsumption(ConsumptionVo consumptionVo);
}
