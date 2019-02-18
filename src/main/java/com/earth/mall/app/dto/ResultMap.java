package com.earth.mall.app.dto;

import java.util.Map;
import java.util.HashMap;

public class ResultMap extends Result {
    private Map<String, Object> data = new HashMap<String, Object>(); // 返回的数据

    public ResultMap() {
        super();
    }

    public ResultMap(int code, String msg) {
        super(code, msg);
    }

    public ResultMap put(String k, Object v) {
        this.data.put(k, v);
        return this;
    }

    public Object remove(String k) {
        return this.data.remove(k);
    }

    public void clear() {
        this.data.clear();
    }

    @Override
    public Map<String, Object> getData() {
        return data;
    }

}
