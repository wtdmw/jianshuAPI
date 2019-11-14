package com.qf.jianshu.mapper;


import com.qf.jianshu.vo.TypeToArticleVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TArticleTypeMapper {
    List<TypeToArticleVo> typeToArticle(Integer typeId);

}