package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSpuSpec;

import java.util.List;
import java.util.Map;

public interface GoodsSpuSpecMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpuSpec record);

    int insertSelective(GoodsSpuSpec record);

    GoodsSpuSpec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSpuSpec record);

    int updateByPrimaryKey(GoodsSpuSpec record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsSpuSpec> selectByParams(Map<String, Object> params);

}