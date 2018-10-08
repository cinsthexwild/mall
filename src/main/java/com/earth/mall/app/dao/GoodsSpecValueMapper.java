package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSpecValue;

public interface GoodsSpecValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpecValue record);

    int insertSelective(GoodsSpecValue record);

    GoodsSpecValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSpecValue record);

    int updateByPrimaryKey(GoodsSpecValue record);
}