package com.qf.jianshu.mapper;



import com.qf.jianshu.entity.SearchCollection;
import com.qf.jianshu.entity.SearchNote;
import com.qf.jianshu.entity.SearchUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SearchMapper {
    @Select("select js_user.avatarPath,js_user.nickName,js_article.timeStamp," +
        "js_article.id,js_article.title,js_article.content from js_article inner " +
        "join js_user on js_article.authorId = js_user.id where js_article.title " +
        "like #{value} or js_article.content like #{value}")
    List<SearchNote> searchNoteList(String value);


    @Select("select js_user.id,js_user.avatarPath,js_user.nickName from js_user where js_user.nickName like #{value}")
    List<SearchUser> searchUserList(String value);

    @Select("select js_special.id,js_special.headImgUrl,js_special.name from js_special where js_special.name like #{value}")
    List<SearchCollection> searchCollectionList(String value);
}
