package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.ArticlePreview;
import com.qf.jianshu.mapper.ArticleMapper;
import com.qf.jianshu.mapper.UserMapper;
import com.qf.jianshu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Map<String, Object> articlesList(Integer endArticlesNb) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<ArticlePreview> articlePreviews = articleMapper.ArticlePreviewList(endArticlesNb);
        if (articlePreviews.size() == 0) {
            map.put("status", "查询失败");
            return map;
        }

        map.put("status", "ok");
        map.put("data", articlePreviews);
        return map;
    }
}
