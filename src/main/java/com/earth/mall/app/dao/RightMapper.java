package com.earth.mall.app.dao;

import com.earth.mall.app.entity.Right;

import java.util.List;
import java.util.Map;

public interface RightMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<Right> selectByParams(Map<String, Object> params);

}