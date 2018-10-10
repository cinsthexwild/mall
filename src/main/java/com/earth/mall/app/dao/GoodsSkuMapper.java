package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSku;

import java.util.List;
import java.util.Map;

public interface GoodsSkuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSku record);

    int insertSelective(GoodsSku record);

    GoodsSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSku record);

    int updateByPrimaryKey(GoodsSku record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsSku> selectByParams(Map<String, Object> params);

}