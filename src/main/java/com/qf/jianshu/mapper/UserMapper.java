package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    //    查询用户表昵称
    @Select("select * from js_user where nickName like #{nickName}")
    List<User> queryNickName(String nickName);

    //    查询用户表手机号
    @Select("select * from js_user where mobileNumber like #{mobileNumber}")
    List<User> querymobileNumber(String mobileNumber);

    //    查询用户表昵称+密码
    @Select("select * from js_user where nickName like #{nickName} and password like #{password}")
    List<User> queryNickNamePassword(String nickName, String password);

    //    添加用户
    @Insert("INSERT INTO js_user(id,nickName,mobileNumber,password,timeStamp) VALUES(#{id}, #{nickName}, #{mobileNumber}, #{password}, #{timeStamp})")
    int addUser(User user);
}
