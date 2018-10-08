package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderLogistics;

public interface OrderLogisticsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    OrderLogistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}