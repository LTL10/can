package com.xyh.can.service;

import com.xyh.can.entity.Menu;
import com.xyh.can.util.MenuVo;

import java.util.List;

public interface MenuService {
    public List<MenuVo> fingpage(MenuVo menuVo);
    public Integer addMenu(Menu menu);//添加菜
    public Integer deteleMenu(Integer id);//删除菜
    public Integer updateMenu(Menu menu);//修改菜
    public  int count(MenuVo menuVo);
    public  int update(Menu menu);
    public  int delete(int id);
    public  int  add(Menu menu);
    public  int deleteone(int tid);

}
