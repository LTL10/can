package com.xyh.can.mapper;

import com.xyh.can.vo.MenuXiangQingVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuXiangQingVoMapper {
    public List<MenuXiangQingVo> MenuXiangQingVo_Page(MenuXiangQingVo menuXiangQingVo);//菜详情
    public  Integer MenuXiangQingVo_Count(MenuXiangQingVo menuXiangQingVo);
}
