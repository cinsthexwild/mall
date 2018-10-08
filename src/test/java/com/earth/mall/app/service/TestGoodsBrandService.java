package com.earth.mall.app.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.earth.mall.app.TestBaseContext;
import com.earth.mall.app.entity.GoodsBrand;

public class TestGoodsBrandService extends TestBaseContext {

    @Autowired
    private IGoodsBrandService goodsBrandService;

    @Test
    public void test() throws Exception {
        long id = 1;
        GoodsBrand goodsBrand = goodsBrandService.queryById(id);
        this.log(goodsBrand);
    }

}
