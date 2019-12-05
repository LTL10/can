package com.xyh.can.entity;

import lombok.Data;

@Data
public class RoleModules {
    private Integer  id;// int 编号 Id N 主键
    private Integer  roleId;// int 角色 Id N
    private Integer  moduleId;// Int 模块 Id N
    private Integer  quanXianId;// int 管理权限 Id N
}
