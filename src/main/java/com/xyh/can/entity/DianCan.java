package com.xyh.can.entity;

import lombok.Data;

@Data
public class DianCan {
    private Integer d_Id;// int 点餐菜单号 N 主键
    private Integer d_Menu;// int 菜编号 N 外键
    private Integer d_OrderId;// int 点餐单编号 N 外键
    private String d_State;// Varchar(10) 菜状态 N
}
