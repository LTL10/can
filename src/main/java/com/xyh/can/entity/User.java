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

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer u_Id) {
        this.u_Id = u_Id;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name;
    }

    public String getU_Password() {
        return u_Password;
    }

    public void setU_Password(String u_Password) {
        this.u_Password = u_Password;
    }

    public String getU_Zsname() {
        return u_Zsname;
    }

    public void setU_Zsname(String u_Zsname) {
        this.u_Zsname = u_Zsname;
    }

    public String getU_IsLockout() {
        return u_IsLockout;
    }

    public void setU_IsLockout(String u_IsLockout) {
        this.u_IsLockout = u_IsLockout;
    }

    public String getU_LastLoginTime() {
        return u_LastLoginTime;
    }

    public void setU_LastLoginTime(String u_LastLoginTime) {
        this.u_LastLoginTime = u_LastLoginTime;
    }

    public String getU_CreateTime() {
        return u_CreateTime;
    }

    public void setU_CreateTime(String u_CreateTime) {
        this.u_CreateTime = u_CreateTime;
    }

    public Integer getU_PsdWrong() {
        return u_PsdWrong;
    }

    public void setU_PsdWrong(Integer u_PsdWrong) {
        this.u_PsdWrong = u_PsdWrong;
    }

    public String getU_LockTime() {
        return u_LockTime;
    }

    public void setU_LockTime(String u_LockTime) {
        this.u_LockTime = u_LockTime;
    }

    public String getU_ProtectEMail() {
        return u_ProtectEMail;
    }

    public void setU_ProtectEMail(String u_ProtectEMail) {
        this.u_ProtectEMail = u_ProtectEMail;
    }

    public String getU_ProtectMTel() {
        return u_ProtectMTel;
    }

    public void setU_ProtectMTel(String u_ProtectMTel) {
        this.u_ProtectMTel = u_ProtectMTel;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }
}
