package com.earth.mall.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSON;

@WebAppConfiguration
@ContextConfiguration({"classpath:spring/dao.xml", "classpath:spring/service.xml",
        "classpath:spring/dispatcher.xml"})
public class TestBaseContextAction {

    @Autowired
    protected WebApplicationContext wac;

    public void log(Object obj) {
        System.out.println(">>> " + JSON.toJSONString(obj));
    }

    @Test
    public void testContext() throws Exception {
//		this.log("TestBaseContextAction load spring配置文件");
    }

}