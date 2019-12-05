package com.xyh.can.entity;

import lombok.Data;

@Data
public class Modules {
    private Integer m_Id;// int 编号 Id N 主键
    private String m_Name;// Varchar(20) 模块名称 N
    private Integer  m_ParentId;// Int 父模块编号 Y
    private String  m_Path;// Varchar(50) 模块路径 N
    private Integer m_Weight;// int 权重 N 越大越高
}
