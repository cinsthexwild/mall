package com.earth.mall.common;

import java.io.Serializable;

public class PageInfo implements Serializable {

    private static final long serialVersionUID = 1849970732535095451L;

    // pagesize ，每一页显示多少
    private int pageSize = Const.PAGE_SIZE;
    // 总记录数
    private int total = 0;
    // 当前页数
    private int currentPage = 1;

    /**
     * 总页数
     *
     * @return
     */
    public int getTotalPage() {
        return pageSize < 1 ? 0 : (int) Math.ceil((double) total / pageSize);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}