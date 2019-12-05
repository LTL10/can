package com.xyh.can.service;

import com.xyh.can.entity.Menu;
import com.xyh.can.util.MenuVo;

import java.util.List;

public interface MenuService {
    public List<MenuVo> fingpage(MenuVo menuVo);
    public  int count();
    public  int update(Menu menu);
    public  int delete(int id);
    public  int  add(Menu menu);
    public  int deleteone(int tid);


}
