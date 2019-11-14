package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.Zan;
import com.qf.jianshu.mapper.ZanDaoMapper;
import com.qf.jianshu.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("zanService")
public class ZanServiceImpl implements ZanService {

    @Autowired
    private ZanDaoMapper izanDao;

    @Override
    public Integer delete(Zan zan) {
        return izanDao.delete(zan);

    }

    @Override
    public Integer addZan(Zan zan) {
        return izanDao.addZan(zan);
    }

    @Override
    public Integer outZan(Zan zan) {


        return izanDao.outZan(zan);
    }

    @Override
    public Integer oppositionZan(Zan zan) {
        return izanDao.oppositionZan(zan);
    }

    @Override
    public Integer getArticleZan(Integer articleId) {
        return izanDao.getArticleZan(articleId);
    }

    @Override
    public Integer getUserZan(String userId) {
        return izanDao.getUserZan(userId);
    }

    @Override
    public Integer getZanStatus(Zan zan) {
        return izanDao.getZanStatus(zan);
    }
}
