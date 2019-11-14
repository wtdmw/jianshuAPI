package com.qf.jianshu.service;


import com.qf.jianshu.vo.TypeToArticleVo;

import java.util.List;

public interface TArticleTypeService {
    List<TypeToArticleVo> typeToArticle(Integer typeId);
}
