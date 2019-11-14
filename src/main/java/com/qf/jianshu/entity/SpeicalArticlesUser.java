package com.qf.jianshu.entity;

import java.io.Serializable;

public class SpeicalArticlesUser implements Serializable {
    private String  id;
    private String title;
    private String authorId;
    private String content;
    private Long timeStamp;
    private String contentImg;
    private String nickName;
    private String avatarPath;

    @Override
    public String toString() {
        return "SpeicalArticlesUser{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorId='" + authorId + '\'' +
                ", content='" + content + '\'' +
                ", timeStamp=" + timeStamp +
                ", contentImg='" + contentImg + '\'' +
                ", nickName='" + nickName + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
}
