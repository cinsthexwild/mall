package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsCategory;

import java.util.List;
import java.util.Map;

public interface GoodsCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    GoodsCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsCategory> selectByParams(Map<String, Object> params);

}