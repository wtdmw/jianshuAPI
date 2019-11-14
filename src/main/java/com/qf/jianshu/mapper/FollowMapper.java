package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.UserFollows;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface FollowMapper {

    @Select("SELECT id FROM js_user WHERE nickName = #{nickName};")
    UserFollows userId(String nickName);

    @Select("SELECT js_user_follow.followUserId FROM js_user_follow " +
            ",js_user WHERE #{js_user.id} not in (js_user_follow.followUserId) LIMIT 0,5;")
    List<UserFollows> follow(String userId);
}
