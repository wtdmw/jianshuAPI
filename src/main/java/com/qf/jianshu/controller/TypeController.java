package com.qf.jianshu.controller;


import com.qf.jianshu.service.TArticleTypeService;
import com.qf.jianshu.vo.TypeToArticleVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource
    private TArticleTypeService ttypeService;

    @RequestMapping(value = "/typeToArticle",method = RequestMethod.GET)
    public List<TypeToArticleVo> typeToArticle(Integer typeId){
        List<TypeToArticleVo> typeVos = ttypeService.typeToArticle(typeId);
        return typeVos;
    }
}
