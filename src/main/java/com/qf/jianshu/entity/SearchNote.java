package com.qf.jianshu.entity;

import lombok.Data;

@Data
public class SearchNote {
    private String avatarPath;
    private String nickName;
    private Long timeStamp;
    private int id;
    private String title;
    private String content;
}
