package com.earth.mall.app.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import com.earth.mall.app.TestBaseContext;
import com.earth.mall.app.entity.GoodsBrand;
import com.earth.mall.common.PageInfo;

public class TestGoodsBrandMapper extends TestBaseContext {

    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

//	@Test
//	public void queryById() throws Exception {
//		this.log("testQueryById");
//		long id = 1;
//		GoodsBrand record = this.goodsBrandMapper.selectByPrimaryKey(id);
//		this.log(record);
//	}

    @Test
    public void queryByPage() throws Exception {
        this.log("queryByPage");
        Map<String, Object> params = new HashMap<String, Object>();
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(1);
        pageInfo.setPageSize(5);
        params.put("name", "goodsBrand");
        params.put("page", pageInfo); // 分页
        List<GoodsBrand> record = this.goodsBrandMapper.selectByPage(params);
        this.log(record);
    }

//	@Test
//	public void insert() throws Exception {
//		this.log("test insert");
//		GoodsBrand record = new GoodsBrand();
//		record.setName("goodsBrand name");
//		record.setCreatedAt(new Date());
//		record.setUpdatedAt(new Date());
//		Assert.assertEquals(this.goodsBrandMapper.insert(record), 1);
//		this.log(record);
//	}
//
//	@Test
//	public void insertSelective() throws Exception {
//		this.log("test insertSelective");
//		GoodsBrand record = new GoodsBrand();
//		record.setName("goodsBrand name");
//		Assert.assertEquals(this.goodsBrandMapper.insertSelective(record), 1);
//		this.log(record);
//	}

//	@Test
//	public void update() throws Exception {
//		this.log("test update");
//		long id = 1;
//		GoodsBrand record = this.goodsBrandMapper.selectByPrimaryKey(id);
//		record.setName("new goodsBrand name1" + new Date());
//		this.log(this.goodsBrandMapper.updateByPrimaryKey(record));
//	}
//
//	@Test
//	public void updateBySelective() throws Exception {
//		this.log("test updateBySelective");
//		long id = 2;
//		GoodsBrand record = new GoodsBrand();
//		record.setId(id);
//		record.setName("new name" + new Date());
//		this.log(this.goodsBrandMapper.updateByPrimaryKeySelective(record));
//	}

//	@Test
//	public void delete() throws Exception {
//		this.log("test delete");
//		long id = 4;
//		this.log(this.goodsBrandMapper.deleteByPrimaryKey(id));
//	}
//
//	@Test
//	public void deleteByIds() throws Exception {
//		this.log("test deleteByIds");
//		List<Long> ids = new ArrayList<Long>();
//		ids.add(21l);
//		ids.add(22l);
//		ids.add(23l);
//		ids.add(24l);
//		this.log(this.goodsBrandMapper.deleteByPrimaryKeys(ids));
//	}

}
