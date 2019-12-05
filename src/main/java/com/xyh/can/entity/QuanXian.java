package com.xyh.can.entity;

import lombok.Data;

@Data
public class QuanXian {
    private Integer q_Id;// int 编号 Id N 主键
    private Integer q_Quanxian;// int 权限 N (增删改)
    private Integer q_ModuleId;// Int 模块 Id N
}
