package com.xyh.can.service.impl;

import com.xyh.can.entity.CanZhuo;
import com.xyh.can.mapper.CanZhuoMapper;
import com.xyh.can.service.CanZhuoService;
import com.xyh.can.vo.CanZhuoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CanZhuoServiceImpl implements CanZhuoService {
    @Autowired
    private CanZhuoMapper canZhuoMapper;
    @Override
    public List<CanZhuoVo> CanZhuoPage(CanZhuoVo canZhuoVo) {
        return canZhuoMapper.CanZhuoPage(canZhuoVo);
    }

    @Override
    public Integer CanZhuoCount(CanZhuoVo canZhuoVo) {
        return canZhuoMapper.CanZhuoCount(canZhuoVo);
    }

    @Override
    public Integer CanZhuoUpdate(CanZhuo canZhuo) {
        return canZhuoMapper.CanZhuoUpdate(canZhuo);
    }
}
