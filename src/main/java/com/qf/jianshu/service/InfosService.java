package com.qf.jianshu.service;

import com.qf.jianshu.entity.HomeArticle;
import com.qf.jianshu.entity.Infos;
import com.qf.jianshu.entity.MyUser;
import com.qf.jianshu.entity.User;

import java.util.List;

public interface InfosService {

    Infos getInfos(String userId);

    MyUser getUserInfos(String userId);

    List<HomeArticle> getArticle(String userId,Integer currentPage);
}
