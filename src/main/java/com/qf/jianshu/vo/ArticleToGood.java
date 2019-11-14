package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.entity.TGood;
import lombok.Data;

import java.util.List;

@Data
public class ArticleToGood extends TArticle {
    private List<TGood> goods;
}
