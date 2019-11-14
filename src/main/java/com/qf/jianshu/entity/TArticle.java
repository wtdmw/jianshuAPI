package com.qf.jianshu.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;

@Data
public class TArticle {
    private Integer tArticleId;

    private String tArticleTitle;

    private String tArticleContent;

    private Integer tArticleWordCount;

    private Integer tArticleReadingCount;

    private Integer tArticleCommentCount;

    private Integer tArticleGoodCount;

    private Integer tArticleBadCount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tArticleLastTime;

    private Integer tArticleTypeId;

    private Integer tArticleStatus;

    private Integer tArticleUserId;
}