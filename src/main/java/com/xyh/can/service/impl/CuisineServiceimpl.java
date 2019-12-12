package com.xyh.can.service.impl;

import com.xyh.can.entity.Cuisine;
import com.xyh.can.mapper.CuisineMapper;
import com.xyh.can.service.CuisineService;
import com.xyh.can.util.CuisineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuisineServiceimpl implements CuisineService {
    @Autowired
    private CuisineMapper cuisineMapper;
    @Override
    public List<CuisineVo> Cfenye(CuisineVo cuisineVo) {
        return cuisineMapper.Cfenye(cuisineVo);
    }

    @Override
    public int Cadd(Cuisine cuisine) {
        return cuisineMapper.Cadd(cuisine);
    }

    @Override
    public int Cupdate(Cuisine cuisine) {
        return cuisineMapper.Cupdate(cuisine);
    }

    @Override
    public int Ccount() {
        return cuisineMapper.Ccount();
    }
}
