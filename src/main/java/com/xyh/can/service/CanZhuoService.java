package com.xyh.can.service;

import com.xyh.can.entity.CanZhuo;
import com.xyh.can.vo.CanZhuoVo;

import java.util.List;

public interface CanZhuoService {
    public List<CanZhuoVo> CanZhuoPage(CanZhuoVo canZhuoVo);
    public Integer CanZhuoCount(CanZhuoVo canZhuoVo);
    public Integer CanZhuoUpdate(CanZhuo canZhuo);
}
