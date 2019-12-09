package com.xyh.can.vo;

import com.xyh.can.entity.User;

public class UserVo {
    private String protectMTel;
    private String protectEMail;
    private String isLockout;
    private String zsname;
    private int page;
    private int limit;
    private int start;

    public UserVo() {
    }

    public String getProtectMTel() {
        return protectMTel;
    }

    public void setProtectMTel(String protectMTel) {
        this.protectMTel = protectMTel;
    }

    public String getProtectEMail() {
        return protectEMail;
    }

    public void setProtectEMail(String protectEMail) {
        this.protectEMail = protectEMail;
    }

    public String getIsLockout() {
        return isLockout;
    }

    public void setIsLockout(String isLockout) {
        this.isLockout = isLockout;
    }

    public String getZsname() {
        return zsname;
    }

    public void setZsname(String zsname) {
        this.zsname = zsname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getStart(){
       return  (page-1)*limit;
    }
}
