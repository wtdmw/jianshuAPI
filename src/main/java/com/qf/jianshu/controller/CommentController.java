package com.qf.jianshu.controller;


import com.qf.jianshu.service.CommentService;
import com.qf.jianshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public ResponseEntity<Object> findLikes(@RequestHeader(name = "nickName") String nickName){
        List<Map> maps = commentService.likesReceived(nickName);
        return new ResponseEntity<>(maps,HttpStatus.OK);
    }

}
