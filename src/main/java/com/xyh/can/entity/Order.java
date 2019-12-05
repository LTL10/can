package com.xyh.can.entity;

import lombok.Data;

@Data
public class Order {
    private Integer o_Id;// int 点餐单编号 N 主键
    private String o_CreateTime;//Date 点餐时间 N
    private Integer o_CanZhuo;// int 餐桌号 N 外键
    private Integer o_UserId;// int 服务员编号 N 外键
}
