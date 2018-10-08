package com.earth.mall.app.service;

import java.util.List;
import java.util.Map;

import com.earth.mall.app.entity.GoodsBrand;

public interface IGoodsBrandService {

    GoodsBrand queryById(Long id);

    List<GoodsBrand> queryList(Map<String, Object> params);

}
