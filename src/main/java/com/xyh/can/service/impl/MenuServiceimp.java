package com.xyh.can.service.impl;

import com.xyh.can.entity.Menu;
import com.xyh.can.mapper.MenuMapper;
import com.xyh.can.service.MenuService;
import com.xyh.can.util.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class MenuServiceimp implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<MenuVo> fingpage(MenuVo menuVo) {
        return menuMapper.fingpage(menuVo);
    }

    @Override
    public Integer addMenu(Menu menu) {
        return menuMapper.addMenu(menu);
    }

    @Override
    public Integer deteleMenu(Integer id) {
        return menuMapper.deteleMenu(id);
    }

    @Override
    public Integer updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu);
    }

    @Override
    public int count(MenuVo menuVo) {
        return menuMapper.count(menuVo);
    }

    @Override
    public int update(Menu menu) {
        return menuMapper.update(menu);
    }

    @Override
    public int delete(int id) {
        return menuMapper.delete( id);
    }

    @Override
    public int add(Menu menu) {
        return menuMapper.add(menu);
    }

    @Override
    public int deleteone(int tid) {
        return menuMapper.deleteone(tid);
    }


}
