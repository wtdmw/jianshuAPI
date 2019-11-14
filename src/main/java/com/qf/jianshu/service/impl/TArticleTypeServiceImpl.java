package com.qf.jianshu.service.impl;


import com.qf.jianshu.mapper.TArticleTypeMapper;
import com.qf.jianshu.service.TArticleTypeService;
import com.qf.jianshu.vo.TypeToArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TArticleTypeServiceImpl implements TArticleTypeService {
    @Resource
    private TArticleTypeMapper ttypeMapper;
    @Override
    public List<TypeToArticleVo> typeToArticle(Integer typeId) {
        return ttypeMapper.typeToArticle(typeId);
    }
}
