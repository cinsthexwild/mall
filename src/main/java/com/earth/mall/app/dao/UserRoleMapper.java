package com.earth.mall.app.dao;

import com.earth.mall.app.entity.UserRole;

import java.util.List;
import java.util.Map;

public interface UserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<UserRole> selectByParams(Map<String, Object> params);

}