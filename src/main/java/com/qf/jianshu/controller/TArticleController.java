package com.qf.jianshu.controller;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.service.TArticleService;
import com.qf.jianshu.vo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class TArticleController {
    @Resource
    private TArticleService tarticleService;


    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public Map<String, Object> findByArticleId(Integer articleId) {
        TArticle article = tarticleService.findById(articleId);
        Integer userId = article.getTArticleUserId();
        List<TArticle> userForArticle = tarticleService.findByUserId(userId);
        ArticleToCommentVo commentVo = tarticleService.articleToComment(articleId);
        List<ArticleToGood> goods = tarticleService.articleToGood(articleId);
        List<ArticleToPictureVo> pictures = tarticleService.articleToPicture(articleId);
        List<ArticleToTypeVo> types = tarticleService.articleToType(articleId);
        ArticleToUserVo user = tarticleService.articleToUser(articleId);
        List<TArticle> allAritcle = tarticleService.findAllAritcle();
        Map<String, Object> map = new HashMap<>();
        map.put("article", article);
        map.put("commentVo", commentVo);
        map.put("allAritcle", allAritcle);
        map.put("goods", goods);
        map.put("userForArticle", userForArticle);
        map.put("pictures", pictures);
        map.put("types", types);
        map.put("user", user);
        return map;
    }

    @RequestMapping(value = "/addReading", method = RequestMethod.GET)
    public void updateReading(TArticle article) { tarticleService.addReading(article);
    }
}
