package com.xyh.can.service.impl;

import com.xyh.can.entity.Roles;
import com.xyh.can.mapper.RolesMapper;
import com.xyh.can.service.RolesService;
import com.xyh.can.vo.RolesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    RolesMapper rolesMapper;
    @Override
    public List<Roles> fingpage(RolesVo rolesvo) {
        return rolesMapper.fingpage(rolesvo);
    }

    @Override
    public Integer Count(RolesVo rolesvo) {
        return rolesMapper.Count(rolesvo);
    }

    @Override
    public Integer addRoles(Roles roles) {
        return rolesMapper.addRoles(roles);
    }

    @Override
    public Integer updateRoles(Roles roles) {
        return rolesMapper.updateRoles(roles);
    }

    @Override
    public Integer delRoles(Integer r_id) {
        return rolesMapper.delRoles(r_id);
    }
}
