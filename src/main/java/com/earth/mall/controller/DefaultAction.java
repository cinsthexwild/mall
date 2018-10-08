package com.earth.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 处理未匹配的url
 *
 * @author chenshixiong
 */
@Controller
public class DefaultAction {

    /**
     *
     * @return
     */
//	@RequestMapping("/*")
//	public String index() {
//		System.out.println("DefaultAction");
//		return "test";
//	}

    /**
     * 可用于多页面
     *
     * @return
     */
//	@RequestMapping(value = { "/index2", "/index2/*" })
//	public String index2() {
//		System.out.println("DefaultAction");
//		return "test";
//	}
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

}
