package com.qf.jianshu.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class HomeArticle {
    private Integer id;
    private String title;
    private String content;
    private String contentImg;

    private Integer viewCount;
    private Integer CommentCount;
    private Integer like;
    private Long timeStamp;




}
