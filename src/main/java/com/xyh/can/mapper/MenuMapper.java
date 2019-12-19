package com.xyh.can.mapper;


import com.xyh.can.entity.Menu;
import com.xyh.can.util.MenuVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuMapper {
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
