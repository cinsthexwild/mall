package com.earth.mall.app.dao;

import com.earth.mall.app.entity.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<UserInfo> selectByParams(Map<String, Object> params);

}