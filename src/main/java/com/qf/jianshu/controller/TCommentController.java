package com.qf.jianshu.controller;


import com.qf.jianshu.entity.TComment;
import com.qf.jianshu.mapper.TCommentMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/comment")
public class TCommentController {
    @Resource
    private TCommentMapper tcommentMapper;

    @RequestMapping(value = "addComment", method = RequestMethod.POST)
    public void addComment(TComment comment) {
        tcommentMapper.addComment(comment);
    }
}
