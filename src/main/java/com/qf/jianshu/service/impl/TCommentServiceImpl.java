package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.TComment;
import com.qf.jianshu.mapper.TCommentMapper;
import com.qf.jianshu.service.TCommentService;
import com.qf.jianshu.vo.CommentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TCommentServiceImpl implements TCommentService {
    @Resource
    private TCommentMapper tcommentMapper;
    @Override
    public List<CommentVo> findByAId(Integer aId) {
        return tcommentMapper.findByAId(aId);
    }
    @Override
    public int addComment(TComment comment) {
        return tcommentMapper.addComment(comment);
    }
}
