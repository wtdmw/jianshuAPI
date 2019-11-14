package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.entity.TPicture;
import lombok.Data;

import java.util.List;

@Data
public class ArticleToPictureVo extends TArticle {
    private List<TPicture> pictures;
}
