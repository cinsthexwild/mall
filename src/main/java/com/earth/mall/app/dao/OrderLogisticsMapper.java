package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderLogistics;

import java.util.List;
import java.util.Map;

public interface OrderLogisticsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    OrderLogistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderLogistics> selectByParams(Map<String, Object> params);

}