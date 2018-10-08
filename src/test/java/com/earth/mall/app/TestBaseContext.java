package com.earth.mall.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/dao.xml", "classpath:spring/service.xml"})
public class TestBaseContext {

    public void log(Object obj) {
        System.out.println(">>> " + JSON.toJSONString(obj));
    }

    @Test
    public void testContext() throws Exception {
//		this.log("TestBaseContext load spring配置文件");
    }

}
