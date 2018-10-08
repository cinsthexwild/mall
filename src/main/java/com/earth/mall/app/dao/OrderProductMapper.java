package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderProduct;

public interface OrderProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);

    OrderProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProduct record);

    int updateByPrimaryKey(OrderProduct record);
}