package com.earth.mall.app.dao;

import com.earth.mall.app.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<Role> selectByParams(Map<String, Object> params);

}