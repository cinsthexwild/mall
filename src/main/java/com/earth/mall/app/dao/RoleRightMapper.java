package com.earth.mall.app.dao;

import com.earth.mall.app.entity.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}