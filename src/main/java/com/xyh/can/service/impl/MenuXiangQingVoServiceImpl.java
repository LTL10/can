package com.xyh.can.service.impl;

import com.xyh.can.mapper.MenuXiangQingVoMapper;
import com.xyh.can.service.MenuXiangQingVoService;
import com.xyh.can.vo.MenuXiangQingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuXiangQingVoServiceImpl implements MenuXiangQingVoService {
    @Autowired
    private MenuXiangQingVoMapper menuXiangQingVoMapper;

    @Override
    public List<MenuXiangQingVo> MenuXiangQingVo_Page(MenuXiangQingVo menuXiangQingVo) {
        return menuXiangQingVoMapper.MenuXiangQingVo_Page(menuXiangQingVo);
    }

    @Override
    public Integer MenuXiangQingVo_Count(MenuXiangQingVo menuXiangQingVo) {
        return menuXiangQingVoMapper.MenuXiangQingVo_Count(menuXiangQingVo);
    }
}
