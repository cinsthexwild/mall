package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderInfo;

import java.util.List;
import java.util.Map;

public interface OrderInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderInfo> selectByParams(Map<String, Object> params);

}