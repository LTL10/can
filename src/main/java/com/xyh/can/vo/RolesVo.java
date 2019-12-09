package com.xyh.can.vo;

public class RolesVo {
    private String rname;
    private int page;
    private int limit;
    private int start;
    public RolesVo() {
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
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
