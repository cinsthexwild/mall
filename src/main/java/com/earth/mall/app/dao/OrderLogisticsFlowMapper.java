package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderLogisticsFlow;

import java.util.List;
import java.util.Map;

public interface OrderLogisticsFlowMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderLogisticsFlow record);

    int insertSelective(OrderLogisticsFlow record);

    OrderLogisticsFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogisticsFlow record);

    int updateByPrimaryKey(OrderLogisticsFlow record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderLogisticsFlow> selectByParams(Map<String, Object> params);

}