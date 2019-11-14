package com.qf.jianshu.controller;


import com.qf.jianshu.service.CommentService;
import com.qf.jianshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;


    /*
    *  avatarPath：头像；
       nickName：用户名；
       timeStamp：评论时间；
       commentContent： 评论内容；
       articleId：评论的文章；*/
    @GetMapping("/comment")
    public ResponseEntity<Object> findAll(@RequestHeader(name = "nickName") String nickName) {
        List<Map> maps = commentService.commentsReceived(nickName);
        return new ResponseEntity<>(maps, HttpStatus.OK);
    }

    @GetMapping("/likes")
    public ResponseEntity<Object> findLikes(@RequestHeader(name = "nickName") String nickName) {
        List<Map> maps = commentService.likesReceived(nickName);
        return new ResponseEntity<>(maps, HttpStatus.OK);
    }

    @GetMapping("/follow")
    public ResponseEntity<Object> follow(@RequestHeader(name = "nickName") String nickName) {
        Map maps = commentService.followList(nickName);
        return new ResponseEntity<>(maps, HttpStatus.OK);
    }

    //关注用户
    @PostMapping("/follow")
    public ResponseEntity<Object> followUser(@RequestHeader(name = "nickName") String nickName, @RequestBody Map<String, String> data) {
        Map<String, Object> map = new HashMap<>();
        String followUserid = commentService.followUser(nickName, data.get("followUserid"));
        if (followUserid.equals("ok")) {
            map.put("data", "ok");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    //取消关注用户
    @DeleteMapping("/follow")
    public ResponseEntity<Object> unfollowUser(@RequestHeader(name = "nickName") String nickName, @RequestBody Map<String, String> data) {
        System.out.println(data.toString());
        Map<String, Object> map = new HashMap<>();
        String unfollowUser = commentService.unfollowUser(nickName, data.get("followUserid"));
        if (unfollowUser.equals("ok")) {
            map.put("data", "ok");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
