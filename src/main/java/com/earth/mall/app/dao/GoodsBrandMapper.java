package com.earth.mall.app.dao;

import java.util.List;
import java.util.Map;

import com.earth.mall.app.entity.GoodsBrand;

public interface GoodsBrandMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    GoodsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsBrand> selectByParams(Map<String, Object> params);

}