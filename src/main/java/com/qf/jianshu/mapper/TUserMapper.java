package com.qf.jianshu.mapper;


import com.qf.jianshu.entity.TUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserMapper {
    TUser findByUserId(Integer userId);
    TUser commentToUserId(Integer userId);
}