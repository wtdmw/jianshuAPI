package com.qf.jianshu.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class User {

    private int id;
    @NotBlank(message = "昵称不能为空")
    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$", message = "昵称格式错误,不包括符号")
    private String nickName;

    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^1[3|4|5|8][0-9]\\d{4,8}$", message = "手机号格式错误")
    private String mobileNumber;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "密码格式错误,八个以上字母和数字")
    private String password;

    private int enable;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", password='" + password + '\'' +
                ", enable=" + enable +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }
}
