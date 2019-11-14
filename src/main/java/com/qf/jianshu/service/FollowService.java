package com.qf.jianshu.service;

import com.qf.jianshu.entity.UserFollows;

import java.util.List;

public interface FollowService {
    UserFollows userId(String nickName);
    List<UserFollows> follow(String userId);
}
