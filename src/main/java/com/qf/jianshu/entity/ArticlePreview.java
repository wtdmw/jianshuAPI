package com.qf.jianshu.entity;

public class ArticlePreview {
    private int id;
    private String title;
    private String authorId;
    private String content;
    private Long timeStamp;
    private String contentImg;
    private String nickName;


    @Override
    public String toString() {
        return "ArticlePreview{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorId='" + authorId + '\'' +
                ", content='" + content + '\'' +
                ", timeStamp=" + timeStamp +
                ", contentImg='" + contentImg + '\'' +
                ", userInfo=" + nickName +
                '}';
    }

    public String getUserInfo() {
        return nickName;
    }

    public void setUserInfo(String nickName) {
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
