package com.qf.jianshu.mapper;


import com.qf.jianshu.entity.TGood;
import com.qf.jianshu.vo.GoodVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TGoodMapper {
    List<GoodVo> findByAid(Integer aId);
    int addGood(TGood good);
    int updateGood(TGood good);
}