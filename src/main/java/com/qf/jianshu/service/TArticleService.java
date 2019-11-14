package com.qf.jianshu.service;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.vo.*;

import java.util.List;

public interface TArticleService {
    TArticle findById(Integer articleId);
    ArticleToUserVo articleToUser(Integer articleId);
    ArticleToCommentVo articleToComment(Integer articleId);
    List<ArticleToTypeVo> articleToType(Integer articleId);
    List<ArticleToGood> articleToGood(Integer articleId);
    List<ArticleToPictureVo> articleToPicture(Integer articleId);
    List<TArticle> findByUserId(Integer userId);
    List<TArticle> findAllAritcle();
    int addReading(TArticle article);
}
