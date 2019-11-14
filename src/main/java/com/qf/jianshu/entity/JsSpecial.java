package com.qf.jianshu.entity;

public class JsSpecial {
    private  Integer id;
    private String headImgUrl;
    private  String name;
    private String describe;
    private  Integer userId;

    @Override
    public String toString() {
        return "JsSpecial{" +
                "id=" + id +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
