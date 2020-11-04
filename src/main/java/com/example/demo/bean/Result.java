package com.example.demo.bean;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 16:04
 * description:用户返回前段的封装类
 */
public class Result {

    /**
    * 设置返回状态0失败1成功
     */
    private int code = 0;
    /**
     * 提示字段
     */
    private String message;

    /**
     * 装数据
     */
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
