package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.User;
import com.qf.jianshu.mapper.CommentMapper;
import com.qf.jianshu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;




    @Override
    public List<Map> commentsReceived(String nickName) {
        //System.out.println(nickName);
        User userId = commentMapper.findUserId(nickName);
        List<Map> comment = commentMapper.findComment(userId.getId());
        //System.out.println(comment);
        //System.out.println(userId);
        return comment;
    }

    @Override
    public List<Map> likesReceived(String nickName) {
        System.out.println(nickName);
        User userId = commentMapper.findUserId(nickName);
        List<Map> likes = commentMapper.findLikes(userId.getId());
        System.out.println(likes);
        System.out.println(userId);
        return likes;
    }
}
