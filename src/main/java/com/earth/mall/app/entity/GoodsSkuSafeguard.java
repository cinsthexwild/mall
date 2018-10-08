package com.earth.mall.app.entity;

import java.util.Date;

public class GoodsSkuSafeguard {
    private Long id;

    private Long skuId;

    private Long safeguardId;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSafeguardId() {
        return safeguardId;
    }

    public void setSafeguardId(Long safeguardId) {
        this.safeguardId = safeguardId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}