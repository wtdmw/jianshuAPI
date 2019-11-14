package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.entity.TComment;
import lombok.Data;

import java.util.List;

@Data
public class ArticleToCommentVo extends TArticle {
    private List<TComment> comments;
}
