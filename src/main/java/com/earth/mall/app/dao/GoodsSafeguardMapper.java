package com.earth.mall.app.dao;

import com.earth.mall.app.entity.GoodsSafeguard;

import java.util.List;
import java.util.Map;

public interface GoodsSafeguardMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSafeguard record);

    int insertSelective(GoodsSafeguard record);

    GoodsSafeguard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsSafeguard record);

    int updateByPrimaryKey(GoodsSafeguard record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<GoodsSafeguard> selectByParams(Map<String, Object> params);

}