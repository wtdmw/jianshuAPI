package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.JsSpecial;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.entity.UserFollows;
import com.qf.jianshu.mapper.UserFollowsMapper;
import com.qf.jianshu.mapper.UserMapper;
import com.qf.jianshu.service.UserFollowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFollowsServiceImpl implements UserFollowsService {

    @Autowired
    private UserFollowsMapper userFollowsMapper;



    @Override
    public List<UserFollows> userFollowsList(String nickName) {
        List<UserFollows> userFollows = userFollowsMapper.userFollowsList(userFollowsMapper.userId(nickName));
        return userFollows;
    }

    @Override
    public List<JsSpecial> userSpecialList(String nickName) {

        List<JsSpecial> jsSpecials = userFollowsMapper.userSpecialList(userFollowsMapper.userId(nickName));
        System.out.println(jsSpecials);
        return jsSpecials;
    }
}
