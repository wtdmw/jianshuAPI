package com.qf.jianshu.controller;

import com.qf.jianshu.entity.UserFollows;
import com.qf.jianshu.service.FollowService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FollowsController {
//    @Service
//    private FollowService followService;
//    @Mapper
//    public ResponseEntity<Object> follows(@RequestHeader(name = "nickName")String nickName ){
//        UserFollows userId = followService.userId(nickName);
//        List<UserFollows> followsList = followService.follow(userId);
//    }
}
