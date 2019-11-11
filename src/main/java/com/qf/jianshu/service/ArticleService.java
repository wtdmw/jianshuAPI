package com.qf.jianshu.service;

import com.qf.jianshu.entity.LoginInfo;

import java.util.Map;

public interface ArticleService {
    //登录
    Map<String, Object> articlesList(Integer endArticlesNb);
}
