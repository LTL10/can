package com.xyh.can.mapper;

import com.xyh.can.entity.Consumption;
import com.xyh.can.vo.ConsumptionVo;

import java.util.List;

/**
 * 消费清单表
 */
public interface ConsumptionMapper {
    public Double countMoney(Integer con_OrderId);//消费总金额
    public List<ConsumptionVo> ConsumptionPage(ConsumptionVo consumptionVo);
    public Integer countConsumption(ConsumptionVo consumptionVo);
}
