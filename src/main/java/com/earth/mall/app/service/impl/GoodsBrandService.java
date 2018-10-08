package com.earth.mall.app.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earth.mall.app.dao.GoodsBrandMapper;
import com.earth.mall.app.entity.GoodsBrand;
import com.earth.mall.app.service.IGoodsBrandService;

@Service("goodsBrandService")
public class GoodsBrandService implements IGoodsBrandService {

    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    public GoodsBrand queryById(Long id) {
        return this.goodsBrandMapper.selectByPrimaryKey(id);
    }

    public List<GoodsBrand> queryList(Map<String, Object> params) {
        return this.goodsBrandMapper.selectByPage(params);
    }

}
