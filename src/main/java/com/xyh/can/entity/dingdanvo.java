package com.xyh.can.entity;

public class dingdanvo {
    private Integer page=1;
    private Integer limit=4;
    private Integer start;
    private String  m_Name;
    private String  d_State;
    private String time1;
    private String time2;

    public String getTime1() {
        return time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

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
                ", time1='" + time1 + '\'' +
                ", time2='" + time2 + '\'' +
                '}';
    }
}
