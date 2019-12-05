package com.xyh.can.entity;

import lombok.Data;

@Data
public class Accounts {
    private Integer a_Id;// int 账目单号 N 主键
    private String a_CreateTime;//Date 账目创建时间N
    private Integer a_ConsumptionId;//int 消费清单号 N
}
