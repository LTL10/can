package com.xyh.can.service.impl;

import com.xyh.can.mapper.ConsumptionMapper;
import com.xyh.can.service.ConsumptionService;
import com.xyh.can.vo.ConsumptionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionServiceImpl implements ConsumptionService {
    @Autowired
    private ConsumptionMapper consumptionMapper;
    @Override
    public Double countMoney(Integer con_OrderId) {
        return consumptionMapper.countMoney(con_OrderId);
    }

    @Override
    public List<ConsumptionVo> ConsumptionPage(ConsumptionVo consumptionVo) {
        return consumptionMapper.ConsumptionPage(consumptionVo);
    }

    @Override
    public Integer countConsumption(ConsumptionVo consumptionVo) {
        return consumptionMapper.countConsumption(consumptionVo);
    }
}
