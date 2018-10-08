package com.earth.mall.app.dao;

import com.earth.mall.app.entity.OrderProductComment;

public interface OrderProductCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderProductComment record);

    int insertSelective(OrderProductComment record);

    OrderProductComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderProductComment record);

    int updateByPrimaryKey(OrderProductComment record);
}