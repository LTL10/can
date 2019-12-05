package com.xyh.can.vo;

import com.xyh.can.entity.Consumption;

public class ConsumptionVo extends Consumption {
    private  Integer page=1;
    private Integer limit=10;
    private Integer start;

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
        return  (page-1)*limit;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
