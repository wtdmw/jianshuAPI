package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.TUser;
import com.qf.jianshu.mapper.TUserMapper;
import com.qf.jianshu.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserMapper tuserMapper;
    @Override
    public TUser findByUserId(Integer userId) {
        return tuserMapper.findByUserId(userId);
    }

    @Override
    public TUser commentToUserId(Integer userId) {
        return tuserMapper.commentToUserId(userId);
    }
}
