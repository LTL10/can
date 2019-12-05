package com.xyh.can.util;

import com.xyh.can.entity.Menu;

public class MenuVo extends Menu {
    private int page = 1;
    private int rows = 10;
    private int start;
    private double min;
    private  double max;

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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getStart() {
        return (page - 1) * rows;
    }
}
