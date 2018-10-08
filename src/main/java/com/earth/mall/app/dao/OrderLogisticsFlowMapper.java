package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderLogisticsFlow;

public interface OrderLogisticsFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderLogisticsFlow record);

    int insertSelective(OrderLogisticsFlow record);

    OrderLogisticsFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogisticsFlow record);

    int updateByPrimaryKey(OrderLogisticsFlow record);
}