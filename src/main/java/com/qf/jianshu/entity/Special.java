package com.qf.jianshu.entity;


import org.springframework.stereotype.Component;

@Component
public class Special {
    private Integer id;
    private String name;
    private String headImgUrl;
    private String describe;
    private String userId;
    private Integer collections;

    private Integer timeStamp;

    public Integer getTimeStamp(){
        return (int) (System.currentTimeMillis()/1000);
    }


    public Integer getCollections() {
        return collections;
    }

    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setTimeStamp() {
        this.timeStamp = getTimeStamp();
    }


    @Override
    public String toString() {
        return "Special{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", describe='" + describe + '\'' +
                ", userId='" + userId + '\'' +
                ", collections=" + collections +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
