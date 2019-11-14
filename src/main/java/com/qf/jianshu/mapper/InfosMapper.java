package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.HomeArticle;
import com.qf.jianshu.entity.MyUser;
import com.qf.jianshu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfosMapper {

    /**
     * 获取关注数
     * @param userId
     * @return
     */
    @Select("select count(*) from js_user_follow where userId=#{userId}")
    Integer getFollow(String userId);

    /**
     * 获取粉丝数
     * @param userId
     * @return
     */
    @Select("select count(*) from js_user_follow where followUserId=#{userId}")
    Integer getFlower(String userId);

    /**
     * 获取关文章数
     * @param userId
     * @return
     */
    @Select("select count(*) from js_article where authorId=#{userId}")
    Integer getArticleCount(String userId);

    /**
     * 获取喜欢数
     * @param userId
     * @return
     */
    @Select("select count(*) from js_user_article_zan where userId=#{userId} and zanType=1")
    Integer getLike(String userId);


    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @Select("select * from js_user where id =#{userId}")
    MyUser getUserInfos(String userId);

    @Select("select id,title,authorId,content,contentImg,timestamp  from js_article where authorId=#{userId} limit #{currentPage},8")
    List<HomeArticle> getArticle(String userId,Integer currentPage);





}
