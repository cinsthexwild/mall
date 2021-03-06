package com.earth.mall.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.earth.mall.app.dto.ResultMap;
import com.earth.mall.common.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.earth.mall.app.dto.Result;
import com.earth.mall.app.entity.GoodsBrand;
import com.earth.mall.app.service.IGoodsBrandService;
import com.earth.mall.common.PageInfo;

@Controller
@RequestMapping("/goods")
public class GoodsAction {
    @Autowired
    private IGoodsBrandService goodsBrandService;

    @RequestMapping(value = "brand/detail2", method = RequestMethod.GET)
    @ResponseBody
    public Result brandDetail2(Long id) {
        return new Result(this.goodsBrandService.queryById(id));
    }

    @RequestMapping(value = "brand/list", method = RequestMethod.GET)
    @ResponseBody
    public Result list(HttpServletRequest request) {
        System.out.println("显示列表");
        Map<String, Object> params = new HashMap<String, Object>();
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(1);
        pageInfo.setPageSize(5);
        params.put("name", "goodsBrand");
        params.put("page", pageInfo); // 分页
        return new Result(this.goodsBrandService.queryList(params));
    }

    @RequestMapping(value = "brand/list2", method = RequestMethod.GET)
    @ResponseBody
    public Result list2(PageInfo pageInfo) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", "goodsBrand");
        params.put("page", pageInfo); // 分页
        return new ResultMap().put("pageInfo", pageInfo).put("list", this.goodsBrandService.queryList(params));
    }

    @RequestMapping("del")
    public void del() {
        System.out.println("删除了图书");
    }

}
