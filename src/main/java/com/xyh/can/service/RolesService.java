package com.xyh.can.service;

import com.xyh.can.entity.Roles;
import com.xyh.can.vo.RolesVo;

import java.util.List;

public interface RolesService {
    public List<Roles> fingpage(RolesVo rolesvo);//角色分页
    public Integer Count(RolesVo rolesvo);//查询总条数
    public Integer addRoles(Roles roles);//添加角色
    public Integer updateRoles(Roles roles);//修改角色
    public Integer delRoles(Integer r_id);//删除角色
}
