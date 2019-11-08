package com.qf.jianshu.service;

import com.qf.jianshu.entity.LoginInfo;

import java.util.Map;

public interface LoginService {
    //登录
    Map<String, Object> login(LoginInfo loginInfo);
}
