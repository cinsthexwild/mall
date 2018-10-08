package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSafeguard;

public interface GoodsSafeguardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsSafeguard record);

    int insertSelective(GoodsSafeguard record);

    GoodsSafeguard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSafeguard record);

    int updateByPrimaryKey(GoodsSafeguard record);
}