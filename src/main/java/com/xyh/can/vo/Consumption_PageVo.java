package com.xyh.can.vo;

public class Consumption_PageVo {
    private Integer con_Id;
    private Integer o_Id;
    private String o_CreateTime;
    private Integer o_CanZhuo;
    private Integer o_UserId;
    private Double sumPrice;
    private Integer page=1;
    private Integer limit=10;
    private Integer start;

    public Consumption_PageVo(Integer con_Id, Integer o_Id, String o_CreateTime, Integer o_CanZhuo, Integer o_UserId, Double sumPrice, Integer page, Integer limit, Integer start) {
        this.con_Id = con_Id;
        this.o_Id = o_Id;
        this.o_CreateTime = o_CreateTime;
        this.o_CanZhuo = o_CanZhuo;
        this.o_UserId = o_UserId;
        this.sumPrice = sumPrice;
        this.page = page;
        this.limit = limit;
        this.start = start;
    }

    public Consumption_PageVo() {
    }

    public Integer getCon_Id() {
        return con_Id;
    }

    public void setCon_Id(Integer con_Id) {
        this.con_Id = con_Id;
    }

    public Integer getO_Id() {
        return o_Id;
    }

    public void setO_Id(Integer o_Id) {
        this.o_Id = o_Id;
    }

    public String getO_CreateTime() {
        return o_CreateTime;
    }

    public void setO_CreateTime(String o_CreateTime) {
        this.o_CreateTime = o_CreateTime;
    }

    public Integer getO_CanZhuo() {
        return o_CanZhuo;
    }

    public void setO_CanZhuo(Integer o_CanZhuo) {
        this.o_CanZhuo = o_CanZhuo;
    }

    public Integer getO_UserId() {
        return o_UserId;
    }

    public void setO_UserId(Integer o_UserId) {
        this.o_UserId = o_UserId;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
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
        return  (page-1)*limit;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Consumption_PageVo{" +
                "con_Id=" + con_Id +
                ", o_Id=" + o_Id +
                ", o_CreateTime='" + o_CreateTime + '\'' +
                ", o_CanZhuo=" + o_CanZhuo +
                ", o_UserId=" + o_UserId +
                ", sumPrice=" + sumPrice +
                ", page=" + page +
                ", limit=" + limit +
                ", start=" + start +
                '}';
    }
}
