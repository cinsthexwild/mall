package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSkuSafeguard;

public interface GoodsSkuSafeguardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsSkuSafeguard record);

    int insertSelective(GoodsSkuSafeguard record);

    GoodsSkuSafeguard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSkuSafeguard record);

    int updateByPrimaryKey(GoodsSkuSafeguard record);
}