package com.qf.jianshu.service;


import com.qf.jianshu.entity.TComment;
import com.qf.jianshu.vo.CommentVo;

import java.util.List;


public interface TCommentService {
    List<CommentVo> findByAId(Integer aId);
    int addComment(TComment comment);
}