package com.qf.jianshu.entity;

import java.io.Serializable;

public class UserFollows implements Serializable {
    private String id;
    private String nickName;
    private String mobileNumber;
    private String password;
    private Integer enable;
    private String avatarPath;
    private String intro;
    private Long timeStamp;
    private String followUserId;

    @Override
    public String toString() {
        return "UserFollows{" +
                "id='" + id + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                ", enable=" + enable +
                ", avatarPath='" + avatarPath + '\'' +
                ", intro='" + intro + '\'' +
                ", timeStamp=" + timeStamp +
                ", followUserId='" + followUserId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(String followUserId) {
        this.followUserId = followUserId;
    }
}
