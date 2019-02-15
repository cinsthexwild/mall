package com.earth.mall.app.dto;

import java.util.Date;

import com.earth.mall.common.StatusCode;
import com.earth.mall.common.Util;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result {

    private int code = StatusCode.SUCCESS; // 响应状态码
    private String msg; // 响应状态描述
    private Long time = new Date().getTime(); // 时间戳
    private Object data; // 返回的数据

    public Result() {
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result(int code, String msg) {
        this(code, msg, null);
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Util.toJson(this);
    }

}
