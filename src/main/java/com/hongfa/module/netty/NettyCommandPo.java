package com.hongfa.module.netty;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class NettyCommandPo implements Serializable {
    private static final long serialVersionUID =  7067659888750837056L;

    private NettyHeader header;                               //命令头部信息
    private Map<String, Object> parameter = new HashMap<String, Object>(); //命令数据主体



    public Map<String, Object> getParameter() {
        return parameter;
    }
    public void setParameter(Map<String, Object> parameter) {
        this.parameter = parameter;
    }
    public NettyHeader getHeader() {
        return header;
    }
    public void setHeader(NettyHeader header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
