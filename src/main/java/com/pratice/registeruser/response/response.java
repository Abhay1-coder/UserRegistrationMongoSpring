package com.pratice.registeruser.response;

public class response {
    int code;
    String msg;
    Object obj;
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
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    @Override
    public String toString() {
        return "response [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
    }
    public response(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
    
}
