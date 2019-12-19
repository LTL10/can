package com.xyh.can.mapper;

import com.xyh.can.entity.Cuisine;
import com.xyh.can.util.CuisineVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CuisineMapper {
    public List<CuisineVo>  Cfenye(CuisineVo cuisineVo);//菜系分页
    public int Cadd(Cuisine cuisine);//菜系添加
    public int Cupdate(Cuisine cuisine);//菜系修改
    public  int Ccount(); //菜系表条数
    public Integer delC(Integer id);//删除菜系
    public List<Cuisine> cxAll();//获取全部菜系
}
