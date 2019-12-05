package com.xyh.can.mapper;

import com.xyh.can.entity.CanZhuo;
import com.xyh.can.vo.CanZhuoVo;

import java.util.List;

public interface CanZhuoMapper {
    public List<CanZhuoVo> CanZhuoPage(CanZhuoVo canZhuoVo);
    public Integer CanZhuoCount(CanZhuoVo canZhuoVo);
    public Integer CanZhuoUpdate(CanZhuo canZhuo);
}
