package com.earth.mall.app.dao;

import com.earth.mall.app.entity.UserAddress;

import java.util.List;
import java.util.Map;

public interface UserAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    int deleteByPrimaryKeys(List<Long> ids);

    List<UserAddress> selectByParams(Map<String, Object> params);

}