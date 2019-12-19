package com.xyh.can.service.impl;

import com.xyh.can.mapper.Consumption_PageVoMapper;
import com.xyh.can.service.Consumption_PageVoService;
import com.xyh.can.vo.Consumption_PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Consumption_PageVoServiceImpl implements Consumption_PageVoService {
    @Autowired
    private Consumption_PageVoMapper consumption_pageVoMapper;
    @Override
    public List<Consumption_PageVo> consumption_PageVo(Consumption_PageVo consumption_pageVo) {
        return consumption_pageVoMapper.consumption_PageVo(consumption_pageVo);
    }

    @Override
    public Integer consumption_PageVoCount(Consumption_PageVo consumption_pageVo) {
        return consumption_pageVoMapper.consumption_PageVoCount(consumption_pageVo);
    }

    @Override
    public List<Consumption_PageVo> eacharts() {
        return consumption_pageVoMapper.eacharts();
    }
}
