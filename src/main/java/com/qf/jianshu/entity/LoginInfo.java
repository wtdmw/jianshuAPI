package com.qf.jianshu.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class LoginInfo {
    @NotBlank(message = "昵称不能为空")
    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$", message = "昵称格式错误,不包括符号")
    private String nickName;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "密码格式错误,八个以上字母和数字")
    private String password;

    private boolean rememberMe;

    @Override
    public String toString() {
        return "LoginInfo{" +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
