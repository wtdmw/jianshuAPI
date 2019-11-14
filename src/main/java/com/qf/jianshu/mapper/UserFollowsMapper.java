package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.JsSpecial;
import com.qf.jianshu.entity.UserFollows;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserFollowsMapper {
    @Select("SELECT js_user.id FROM js_user WHERE js_user.nickName = #{nickName};")
    String userId(String nickName);

    @Select("SELECT jf.userId,jf.followUserId,ju.nickName,ju.avatarPath FROM js_user_follow jf\n" +
            "            LEFT JOIN js_user ju ON jf.followUserId = ju.id WHERE jf.userId = #{userId};")
    List<UserFollows> userFollowsList(String userId);

    @Select("SELECT js_special.`name`,js_special.headImgUrl FROM\n" +
            "js_special_user LEFT\n" +
            "JOIN js_special ON js_special_user.specialId = \n" +
            "js_special.id WHERE js_special_user.userId = #{userId};")
    List<JsSpecial> userSpecialList(String userId);


}
