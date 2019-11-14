package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.*;
import com.qf.jianshu.mapper.InfosMapper;
import com.qf.jianshu.mapper.ZanDaoMapper;
import com.qf.jianshu.service.InfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class InfosServiceImpl implements InfosService {

    @Autowired
    InfosMapper infosDao;

    @Autowired
    ZanDaoMapper zanDao;

    @Override
    public Infos getInfos(String userId) {
        Infos infos = new Infos();
        infos.setFollow(infosDao.getFollow(userId));
        infos.setFlower(infosDao.getFlower(userId));
        infos.setArticleCount(infosDao.getArticleCount(userId));
        infos.setLike(infosDao.getLike(userId));
        return infos;
    }

    @Override
    public MyUser getUserInfos(String userId) {
        return infosDao.getUserInfos(userId);
    }

    @Override
    public List<HomeArticle> getArticle(String userId,Integer currentPage) {
        List<HomeArticle> articleList = infosDao.getArticle(userId,currentPage*8);
        return articleList;
    }
}
