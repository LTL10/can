package com.xyh.can.util;

import com.xyh.can.entity.Menu;

public class MenuVo extends Menu {
    private int page = 1;
    private int limit = 10;
    private int start;
    private double min;
    private  double max;
    private String name;

    public String getName() {
        return name;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
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

    @Override
    public String toString() {
        return "MenuVo{" +
                "page=" + page +
                ", limit=" + limit +
                ", start=" + start +
                ", min=" + min +
                ", max=" + max +
                ", name='" + name + '\'' +
                '}';
    }

    public int getStart() {
        return (page - 1) * limit;
    }
}
