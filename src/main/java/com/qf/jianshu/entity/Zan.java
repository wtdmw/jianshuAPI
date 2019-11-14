package com.qf.jianshu.entity;

import org.springframework.stereotype.Component;

@Component
public class Zan {
    private String userId;
    private Integer articleId;
    private Integer zanType;
    private Integer timeStamp;


    public Integer getTimeStamp(){
        return (int) (System.currentTimeMillis()/1000);
    }

    public void setTimeStamp() {
        this.timeStamp = getTimeStamp();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getZanType() {
        return zanType;
    }

    public void setZanType(Integer zanType) {
        this.zanType = zanType;
    }

    @Override
    public String toString() {
        return "Zan{" +
                "userId='" + userId + '\'' +
                ", articleId=" + articleId +
                ", zanType=" + zanType +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
