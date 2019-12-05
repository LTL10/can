package com.xyh.can.entity;

import lombok.Data;

@Data
public class Consumption {
    private Integer con_Id;// int 消费清单号 N 主键
    private Integer con_DianCaiId;//int 点餐菜单号 N 外键
    private Integer con_OrderId;//int 点餐单编号 N 外键
    private Double con_Money;// double 金额 N
}
