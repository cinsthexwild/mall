package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSpecValue;

import java.util.List;
import java.util.Map;

public interface GoodsSpecValueMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpecValue record);

    int insertSelective(GoodsSpecValue record);

    GoodsSpecValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSpecValue record);

    int updateByPrimaryKey(GoodsSpecValue record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsSpecValue> selectByParams(Map<String, Object> params);

}