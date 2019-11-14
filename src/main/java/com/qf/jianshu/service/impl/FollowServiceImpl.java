package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.UserFollows;
import com.qf.jianshu.mapper.FollowMapper;
import com.qf.jianshu.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    private FollowMapper followMapper;
    @Override
    public UserFollows userId(String nickName) {
        UserFollows userId = followMapper.userId(nickName);
        return userId;
    }

    @Override
    public List<UserFollows> follow(String userId) {
        List<UserFollows> followsList = followMapper.follow(userId);
        return followsList;
    }
}
