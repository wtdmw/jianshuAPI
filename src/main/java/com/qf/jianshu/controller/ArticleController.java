package com.qf.jianshu.controller;

import com.qf.jianshu.entity.LoginInfo;
import com.qf.jianshu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Validated
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/articlesList")
    public ResponseEntity<Object> login(@RequestParam("endArticlesNb") @Min(value = 1, message = "参数错误") Integer endArticlesNb) {
        Map<String, Object> map = new HashMap<>();
//        System.out.println(endArticlesNb);

//        获取数据
        Map<String, Object> articlesListMap = articleService.articlesList(endArticlesNb);

        //业务错误
        if (!articlesListMap.get("status").equals("ok")) {
            map.put("message", articlesListMap.get("status"));
            return new ResponseEntity<>(map, HttpStatus.FORBIDDEN);
        }
        map.put("data", articlesListMap.get("data"));
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
