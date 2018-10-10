package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderProduct;

import java.util.List;
import java.util.Map;

public interface OrderProductMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);

    OrderProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProduct record);

    int updateByPrimaryKey(OrderProduct record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderProduct> selectByParams(Map<String, Object> params);

}