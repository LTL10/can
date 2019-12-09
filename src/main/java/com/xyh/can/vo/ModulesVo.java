package com.xyh.can.vo;

public class ModulesVo {

    private String mname;
    private int page;
    private int limit;
    private int start;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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
