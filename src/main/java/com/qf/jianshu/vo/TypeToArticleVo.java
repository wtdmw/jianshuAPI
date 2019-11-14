package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.entity.TArticleType;
import lombok.Data;

import java.util.List;

@Data
public class TypeToArticleVo extends TArticleType {
    private List<TArticle> articles;
}
