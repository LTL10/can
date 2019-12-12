package com.xyh.can.util;

import com.xyh.can.entity.Cuisine;

public class CuisineVo extends Cuisine {
    private int page = 1;
    private int limit = 10;
    private int start;
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

    public int getStart() {
        return (page - 1) * limit;
    }
}
