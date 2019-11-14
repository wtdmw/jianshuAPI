package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.LoginInfo;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.mapper.UserMapper;
import com.qf.jianshu.service.LoginService;
import com.qf.jianshu.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Map<String, Object> login(LoginInfo loginInfo) {

        Map<String, Object> map = new HashMap<String, Object>();

//        查询用户表
        List<Map> usersList = userMapper.queryNickNamePassword(loginInfo.getNickName(), loginInfo.getPassword());
        if (usersList.size() == 0) {
            map.put("status", "密码或账号错误");
            return map;
        }


//        签发token
        String token = new TokenUtil().generateToken(usersList.get(0), (loginInfo.isRememberMe() ? 1296000000 : 0));
//        System.out.println(token);
        map.put("status", "ok");
        map.put("token", token);
        map.put("user", usersList.get(0));
        return map;
    }
}
