package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSpec;

public interface GoodsSpecMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpec record);

    int insertSelective(GoodsSpec record);

    GoodsSpec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSpec record);

    int updateByPrimaryKey(GoodsSpec record);
}