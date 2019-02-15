package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderProductComment;

import java.util.List;
import java.util.Map;

public interface OrderProductCommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderProductComment record);

    int insertSelective(OrderProductComment record);

    OrderProductComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProductComment record);

    int updateByPrimaryKey(OrderProductComment record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<OrderProductComment> selectByParams(Map<String, Object> params);

}