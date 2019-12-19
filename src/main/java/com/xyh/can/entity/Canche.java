package com.xyh.can.entity;

import lombok.Data;

@Data
public class Canche {
    private Integer cc_Id;
    private Integer cc_MenuId;
    private Integer cc_Num;
    private double cc_Sum;
    private Integer cc_CanZhuoId;
    private Integer cc_UserId;
    private Menu menu;

}
