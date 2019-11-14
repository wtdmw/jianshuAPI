package com.qf.jianshu.service;


import com.qf.jianshu.entity.TUser;

public interface TUserService {
    TUser findByUserId(Integer userId);
    TUser commentToUserId(Integer userId);
}