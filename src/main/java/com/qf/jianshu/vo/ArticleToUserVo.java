package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TArticle;
import com.qf.jianshu.entity.TUser;
import lombok.Data;


@Data
public class ArticleToUserVo extends TArticle {
    private TUser user;
}
