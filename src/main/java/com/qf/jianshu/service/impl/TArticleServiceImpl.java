package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.mapper.TArticleMapper;
import com.qf.jianshu.service.TArticleService;
import com.qf.jianshu.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TArticleServiceImpl implements TArticleService {
    @Resource
    private TArticleMapper tarticleMapper;

    @Override
    public TArticle findById(Integer articleId) {
        return tarticleMapper.findById(articleId);
    }

    @Override
    public ArticleToUserVo articleToUser(Integer articleId) {
        return tarticleMapper.articleToUser(articleId);
    }

    @Override
    public ArticleToCommentVo articleToComment(Integer articleId) {
        return tarticleMapper.articleToComment(articleId);
    }

    @Override
    public List<ArticleToTypeVo> articleToType(Integer articleId) {
        return tarticleMapper.articleToType(articleId);
    }

    @Override
    public List<ArticleToGood> articleToGood(Integer articleId) {
        return tarticleMapper.articleToGood(articleId);
    }

    @Override
    public List<ArticleToPictureVo> articleToPicture(Integer articleId) {
        return tarticleMapper.articleToPicture(articleId);
    }

    @Override
    public List<TArticle> findAllAritcle() {
        return tarticleMapper.findAllAritcle();
    }

    @Override
    public List<TArticle> findByUserId(Integer userId) {
        return tarticleMapper.findByUserId(userId);
    }

    @Override
    public int addReading(TArticle article) {
        return tarticleMapper.addReading(article);
    }
}
