package com.example.basemodel.api;

/**
 * Created by Administrator on 2018/5/8.
 */

public class ResultApi<T> {

    private int code;//返回code字段

    private String msg;//返回msg

    private T data;

    public ResultApi(int code, String msg) {
        this.code = code;
        this.msg = msg;
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

    public T getOutput() {
        return data;
    }

    public void setOutput(T output) {
        this.data = output;
    }
}
