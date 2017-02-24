package com.bjhetang.domain;

/**
 * Created by Liuqi
 * Date: 2017/2/24.
 */
public class Page {
    private int pageNow;
    private final int pageSize = 10;

    public Page(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageNow() {
        return pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }


}
