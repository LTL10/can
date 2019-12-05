package com.xyh.can.entity;

import lombok.Data;

@Data
public class CanZhuo {
    private Integer c_Id;// int 餐桌编号 N 主键
    private String c_Type;// Varchar(20) 餐桌类型 N
    private String c_Start;// Varchar(10) 餐桌状态 N
}
