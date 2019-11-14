package com.qf.jianshu.service;

import com.qf.jianshu.entity.JsSpecial;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.entity.UserFollows;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserFollowsService {

    List<UserFollows> userFollowsList(String UserId);

    List<JsSpecial> userSpecialList(String userId);
}
