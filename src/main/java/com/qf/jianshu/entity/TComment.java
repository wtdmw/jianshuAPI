package com.qf.jianshu.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;

@Data
public class TComment {
    private Integer tCommentId;

    private Integer tUserId;

    private String tCommentContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tCommentTime;

    private Integer tCommentGoodCount;

    private Integer tCommentBadCount;

    private Integer tCommentReplyCount;

    private Integer tCommentStatus;

    private Integer tCommentArticleId;
}