package com.qf.jianshu.mapper;



import com.qf.jianshu.entity.Zan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ZanDaoMapper {


    /**
     * 每次更改前删除赞
     * @param zan
     * @return
     */
    @Delete("delete from  js_user_article_zan where userId=#{userId} and articleId=#{articleId}")
    Integer delete(Zan zan);


    /**
     * 点赞
     * @param zan
     * @return
     */
    @Insert("insert into js_user_article_zan values(#{userId},#{articleId},1,#{timeStamp})")
    Integer addZan(Zan zan);

    /**
     * 取消赞
     * @param zan
     * @return
     */
    @Insert("insert into js_user_article_zan values(#{userId},#{articleId},0,#{timeStamp})")
    Integer outZan(Zan zan);

    /**
     * 反对赞
     * @param zan
     * @return
     */
    @Insert("insert into js_user_article_zan values(#{userId},#{articleId},2,#{timeStamp})")
    Integer oppositionZan(Zan zan);

    @Select("select zanType from js_user_article_zan where articleId=#{articleId} and userId=#{userId} ")
    Integer getZanStatus(Zan zan);

    /**
     * 获取文章赞
     * @param articleId
     * @return
     */
    @Select("select count(*) from js_user_article_zan where articleId=#{articleId} and zanType=1")
    Integer getArticleZan(Integer articleId);


    /**
     * 获取用户赞
     * @param userId
     * @return
     */
    @Select("select count(*) from js_user_article_zan where userId=#{userId} and zanType=1;")
    Integer getUserZan(String  userId);


}
