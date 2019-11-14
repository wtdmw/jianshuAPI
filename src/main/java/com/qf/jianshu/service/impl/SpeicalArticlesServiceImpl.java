package com.qf.jianshu.service.impl;

import com.qf.jianshu.entity.SpeicalArticlesUser;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.mapper.SpecialArticlesMapper;
import com.qf.jianshu.service.SpeicalArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpeicalArticlesServiceImpl implements SpeicalArticlesService {
    @Autowired
    private SpecialArticlesMapper specialArticlesMapper;
    @Override
    public List<SpeicalArticlesUser> speicalArticles(String nickNames) {
        List<SpeicalArticlesUser> sa = specialArticlesMapper.speicalArticles(nickNames);
        return sa;
    }

    @Override
    public SpeicalArticlesUser user(String nickNames) {
        SpeicalArticlesUser user = specialArticlesMapper.user(nickNames);
        return user;
    }


}
