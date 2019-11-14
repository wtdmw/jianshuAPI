package com.qf.jianshu.service;

import com.qf.jianshu.entity.SpeicalArticlesUser;
import com.qf.jianshu.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SpeicalArticlesService {
    List<SpeicalArticlesUser> speicalArticles(String nickNames);

    SpeicalArticlesUser user(String nickNames);

}
