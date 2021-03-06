package com.earth.mall.app.dao;

import com.earth.mall.app.entity.ShopInfo;

import java.util.List;
import java.util.Map;

public interface ShopInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    ShopInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<ShopInfo> selectByParams(Map<String, Object> params);

}