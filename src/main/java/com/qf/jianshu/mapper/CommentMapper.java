package com.qf.jianshu.mapper;


import com.qf.jianshu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommentMapper {
    /*
     * 用户名查id*/
    @Select("select * from js_user where nickName like #{nickName}")
    User findUserId(String nickName);

    /**
     * 获取评论信息
     */
    @Select("select js_comment.id,js_comment.commentContent,js_comment.`timeStamp`,js_comment.userId,js_comment.articleId,js_article.title,js_user.avatarPath,js_user.nickName\n" +
            "from js_comment\n" +
            "LEFT JOIN js_article \n" +
            "ON js_article.id=js_comment.articleId\n" +
            "LEFT JOIN js_user\n" +
            "on js_user.id=js_comment.commentUserId\n" +
            "where js_comment.userId like #{userId}")
    List<Map> findComment(String userId);

    /**
     * 获取喜欢信息
     */
    @Select("select js_user_article_zan.`timeStamp`,js_article.title,js_user.avatarPath,js_user.nickName\n" +
            "from js_user_article_zan \n" +
            "LEFT JOIN js_article\n" +
            "on js_user_article_zan.articleId=js_article.id\n" +
            "LEFT JOIN js_user\n" +
            "on js_user.id=js_user_article_zan.likesUserId\n" +
            "where js_user_article_zan.userId like #{userId}")
    List<Map> findLikes(String userId);




















    /*  *//*查找用户头像*//*
    @Select("select avatarPath from js_user where nickName='Ericcci'")
    List<Map> findAvatarPath();

    *//*
     * 查找评论id
     * *//*
    @Select("select js_user_article_comment.commentId from js_user,js_user_article_comment where js_user.id=js_user_article_comment.userId")
    List<Map> findCommentId();

    *//*
     * 查找评论时间和内容
     * *//*
    @Select("select js_comment.commentContent,js_comment.`timeStamp` from js_user_article_comment,js_comment where js_user_article_comment.commentId=js_comment.id")
    List<Map> findTimeComment();

*/

}
