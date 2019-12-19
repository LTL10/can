package com.xyh.can.service;

import com.xyh.can.vo.Consumption_PageVo;

import java.util.List;

public interface Consumption_PageVoService {
    public List<Consumption_PageVo> consumption_PageVo(Consumption_PageVo consumption_pageVo);
    public Integer consumption_PageVoCount(Consumption_PageVo consumption_pageVo);
    public List<Consumption_PageVo> eacharts();
}
