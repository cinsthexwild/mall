package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSkuSpecValue;

import java.util.List;
import java.util.Map;

public interface GoodsSkuSpecValueMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSkuSpecValue record);

    int insertSelective(GoodsSkuSpecValue record);

    GoodsSkuSpecValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSkuSpecValue record);

    int updateByPrimaryKey(GoodsSkuSpecValue record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsSkuSpecValue> selectByParams(Map<String, Object> params);

}