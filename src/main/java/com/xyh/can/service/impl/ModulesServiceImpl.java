package com.xyh.can.service.impl;

import com.xyh.can.entity.Modules;
import com.xyh.can.mapper.ModulesMapper;
import com.xyh.can.service.ModulesService;
import com.xyh.can.vo.ModulesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModulesServiceImpl implements ModulesService {
    @Autowired
    ModulesMapper modulesMapper;

    @Override
    public List<Modules> fingpage(ModulesVo modulesVo) {
        return modulesMapper.fingpage(modulesVo);
    }

    @Override
    public Integer Count(ModulesVo modulesVo) {
        return modulesMapper.Count(modulesVo);
    }

    @Override
    public Integer addModules(Modules modules) {
        return modulesMapper.addModules(modules);
    }

    @Override
    public Integer updateModules(Modules modules) {
        return modulesMapper.updateModules(modules);
    }

    @Override
    public Integer delModules(Integer u_id) {
        return modulesMapper.delModules(u_id);
    }
}
