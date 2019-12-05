package com.xyh.can.entity;

import lombok.Data;

@Data
public class Roles {
    private Integer r_Id;// int 编号 Id N 主键
    private String r_Name;// Varchar(20) 角色名称 N
    private Integer r_Weight;// Int 角色权重 N 越大越高
}
