package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.SpeicalArticlesUser;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.entity.UserFollows;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SpecialArticlesMapper {
    @Select("SELECT js_article.title,js_article.contentImg,js_article.content \n" +
            "FROM js_user LEFT JOIN js_article ON js_user.id = js_article.authorId\n" +
            "WHERE js_user.nickName = #{nickName};")
    List<SpeicalArticlesUser> speicalArticles(String nickNames);


    @Select("SELECT js_user.avatarPath ,js_user.nickName,js_user.id FROM js_user WHERE js_user.nickName = #{nickName};")
   SpeicalArticlesUser user(String nickNames);
}
