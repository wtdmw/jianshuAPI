package com.qf.jianshu.mapper;


import com.qf.jianshu.entity.TComment;
import com.qf.jianshu.vo.CommentVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TCommentMapper {
    List<CommentVo> findByAId(Integer aId);
    int addComment(TComment comment);
}