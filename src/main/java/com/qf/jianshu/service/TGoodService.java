package com.qf.jianshu.service;


import com.qf.jianshu.entity.TGood;
import com.qf.jianshu.vo.GoodVo;

import java.util.List;


public interface TGoodService {
    List<GoodVo> findByAid(Integer aId);
    int addGood(TGood good);
    int updateGood(TGood good);
}