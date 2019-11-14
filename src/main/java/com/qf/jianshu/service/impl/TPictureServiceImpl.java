package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.TPicture;
import com.qf.jianshu.mapper.TPictureMapper;
import com.qf.jianshu.service.TPictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TPictureServiceImpl implements TPictureService {
    @Resource
    private TPictureMapper tpictureMapper;
    @Override
    public List<TPicture> findByAid(Integer aid) {
        return tpictureMapper.findByAid(aid);
    }
}
