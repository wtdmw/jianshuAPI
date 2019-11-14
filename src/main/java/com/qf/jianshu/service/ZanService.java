package com.qf.jianshu.service;


import com.qf.jianshu.entity.Zan;

public interface ZanService {

    Integer delete(Zan zan);

    Integer addZan(Zan zan);

    Integer outZan(Zan zan);

    Integer oppositionZan(Zan zan);

    Integer getArticleZan(Integer articleId);

    Integer getUserZan(String userId);

    Integer getZanStatus(Zan zan);


}
