package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderPayHistory;

public interface OrderPayHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderPayHistory record);

    int insertSelective(OrderPayHistory record);

    OrderPayHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPayHistory record);

    int updateByPrimaryKey(OrderPayHistory record);
}