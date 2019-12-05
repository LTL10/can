package com.xyh.can.entity;

import lombok.Data;

@Data
public class User {
    private Integer u_Id;//int 编号 Id N 主键
    private String u_Name;//Varchar(20) 登陆名 N 用户名
    private String u_Password;//Varchar(20) 登陆密码 N
    private String u_Zsname;//Varchar(20) 真实姓名 N
    private String u_IsLockout;//Char(2) 是/否（锁 定） N 默认否
    private String u_LastLoginTime;// DataTime 最后一次登 录时间 Y
    private String u_CreateTime;// DataTime 用户创建时 间 N
    private Integer u_PsdWrong;//int 密码错误次 数 N 默认 0
    private String u_LockTime;//DataTime 被锁定时间 Y
    private String u_ProtectEMail;// Varchar(20) 密保邮箱 N
    private String u_ProtectMTel;//Varchar(11) 密保手机 N
    private UserRoles userRoles;
}
