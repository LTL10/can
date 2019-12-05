package com.xyh.can.entity;

import lombok.Data;

@Data
public class UserRoles {
    private Integer id;// int 编号 Id N 主键
    private Integer userId;// int 用户 Id N
    private Integer rolesId;// int 角色 Id N
}
