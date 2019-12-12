package com.xyh.can.service;

import com.xyh.can.vo.MenuXiangQingVo;

import java.util.List;

public interface MenuXiangQingVoService {
    public List<MenuXiangQingVo> MenuXiangQingVo_Page(MenuXiangQingVo menuXiangQingVo);//菜详情
    public  Integer MenuXiangQingVo_Count(MenuXiangQingVo menuXiangQingVo);
}
