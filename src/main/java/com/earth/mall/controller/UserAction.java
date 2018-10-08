package com.earth.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAction {

    @RequestMapping("list")
    public String list() {
        System.out.println("列表");
        return "Goods";
    }

}
