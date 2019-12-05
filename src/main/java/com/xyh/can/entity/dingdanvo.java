package com.xyh.can.entity;

import lombok.Data;


public class dingdanvo {
    private Integer page=1;
    private Integer limit=4;
    private Integer start;
    private String  m_Name;
    private String  d_State;

    public Integer getPage() {
        return page;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getStart() {
        return (page-1)*limit;
    }

    public String getM_Name() {
        return m_Name;
    }

    public String getD_State() {
        return d_State;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public void setD_State(String d_State) {
        this.d_State = d_State;
    }

    @Override
    public String toString() {
        return "dingdanvo{" +
                "page=" + page +
                ", limit=" + limit +
                ", start=" + start +
                ", m_Name='" + m_Name + '\'' +
                ", d_State='" + d_State + '\'' +
                '}';
    }
}
