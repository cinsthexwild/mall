package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderCart;

import java.util.List;
import java.util.Map;

public interface OrderCartMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderCart record);

    int insertSelective(OrderCart record);

    OrderCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderCart record);

    int updateByPrimaryKey(OrderCart record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderCart> selectByParams(Map<String, Object> params);

}