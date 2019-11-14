package com.qf.jianshu.entity;

import org.springframework.stereotype.Component;


@Component
public class ZanMsg {




    //100为成功 200为失败
    private Integer code;

    private String message;

    private Integer count;

    private Integer status;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "ZanMsg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", count=" + count +
                ", status=" + status +
                '}';
    }
}
