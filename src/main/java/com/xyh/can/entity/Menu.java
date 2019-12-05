package com.xyh.can.entity;

import lombok.Data;

@Data
public class Menu {
    private Integer m_Id;// int 菜编号 N 主键
    private Integer m_Type;// int 菜系 N 外键
    private String m_Name;// Varchar(20) 菜名 N
    private String m_Photo;// Varchar(20) 菜图片 N
    private Double m_Price;// double 菜价 N
    private String m_Note;// Varchar(50) 菜说明 N
}
