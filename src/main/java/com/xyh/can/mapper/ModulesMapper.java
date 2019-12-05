package com.xyh.can.mapper;

import com.xyh.can.entity.Modules;
import com.xyh.can.vo.ModulesVo;

import java.util.List;

public interface ModulesMapper {
    public List<Modules> fingpage(ModulesVo modulesVo);//模块分页
    public Integer Count(ModulesVo modulesVo);//查询总条数
    public Integer addModules(Modules modules);//添加模块
    public Integer updateModules(Modules modules);//修改模块
    public Integer delModules(Integer u_id);//删除模块
}
