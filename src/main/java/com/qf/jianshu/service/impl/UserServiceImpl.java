package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.User;
import com.qf.jianshu.mapper.UserMapper;
import com.qf.jianshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String createUser(User user) {
//        验证昵称是否存在
        List<User> queryNickNameList = userMapper.queryNickName(user.getNickName());
        if (queryNickNameList.size() > 0) {
            return "昵称已被占用";
        }
//        验证手机号是否存在
        List<User> querymobileNumberList = userMapper.querymobileNumber(user.getMobileNumber());
        if (querymobileNumberList.size() > 0) {
            return "手机号已注册";
        }
//        添加用户
        int addUserInt = userMapper.addUser(user);
        if (addUserInt != 1) {
            return "注册失败";
        }

        return "ok";
    }
}
