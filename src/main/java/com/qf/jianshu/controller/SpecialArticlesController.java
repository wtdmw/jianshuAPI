package com.qf.jianshu.controller;

import com.qf.jianshu.entity.SpeicalArticlesUser;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.service.SpeicalArticlesService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.List;

@RestController
public class SpecialArticlesController {

    @Autowired
    private SpeicalArticlesService speicalArticlesService;

    @GetMapping("/specialArticles")
    public ResponseEntity<Object> specialArticles(@RequestParam(required = false) String nickNames){
        System.out.println(nickNames);
        List<SpeicalArticlesUser> sa = speicalArticlesService.speicalArticles(nickNames);
        SpeicalArticlesUser user = speicalArticlesService.user(nickNames);
        HashMap<String, Object> map = new HashMap<>();
        map.put("specialArticles",sa);
        map.put("user",user);
        System.out.println("map:"+map);

//        map.put("specialArticles","aaaa");
        return new ResponseEntity<>(map, HttpStatus.OK);

    }
}
