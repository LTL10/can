package com.xyh.can.mapper;

import com.xyh.can.vo.Consumption_PageVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Consumption_PageVoMapper {
    public List<Consumption_PageVo> consumption_PageVo(Consumption_PageVo consumption_pageVo);
    public Integer consumption_PageVoCount(Consumption_PageVo consumption_pageVo);
}
