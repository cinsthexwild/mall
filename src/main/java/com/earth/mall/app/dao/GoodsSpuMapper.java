package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSpu;

public interface GoodsSpuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpu record);

    int insertSelective(GoodsSpu record);

    GoodsSpu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSpu record);

    int updateByPrimaryKey(GoodsSpu record);
}