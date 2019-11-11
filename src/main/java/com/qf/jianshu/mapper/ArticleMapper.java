package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.ArticlePreview;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    //    获取首页文章列表  /ArticlesList
    @Select("SELECT js_article.authorId, js_article.content,js_article.id,js_article.`timeStamp`,js_article.title,js_user.nickName,js_article.contentImg\n" +
            "FROM js_article\n" +
            "INNER JOIN js_user\n" +
            "ON js_article.authorId=js_user.id\n" +
            "where js_article.id >= #{endArticlesNb} limit 8")
    List<ArticlePreview> ArticlePreviewList(int endArticlesNb);
}
