package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.TGood;
import com.qf.jianshu.mapper.TGoodMapper;
import com.qf.jianshu.service.TGoodService;
import com.qf.jianshu.vo.GoodVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TGoodServiceImpl implements TGoodService {
    @Resource
    private TGoodMapper tgoodMapper;

    @Override
    public int addGood(TGood good) {
        return tgoodMapper.addGood(good);
    }

    @Override
    public int updateGood(TGood good) {
        return tgoodMapper.updateGood(good);
    }

    @Override
    public List<GoodVo> findByAid(Integer aId) {
        return tgoodMapper.findByAid(aId);
    }
}
