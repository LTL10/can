package com.xyh.can.vo;

import com.xyh.can.entity.Menu;

public class MenuXiangQingVo extends Menu {
    private Integer o_Id;
    private Integer page=1;
    private Integer limit=10;
    private Integer start;

    public Integer getO_Id() {
        return o_Id;
    }

    public void setO_Id(Integer o_Id) {
        this.o_Id = o_Id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getStart() {
        return (page-1)*limit;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
