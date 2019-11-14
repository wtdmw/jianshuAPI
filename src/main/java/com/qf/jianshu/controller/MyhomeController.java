package com.qf.jianshu.controller;


import com.qf.jianshu.entity.*;
import com.qf.jianshu.service.InfosService;
import com.qf.jianshu.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MyhomeController {
    @Autowired
    InfosService infosService;

    @Autowired
    ZanService zanDao;

    @GetMapping("/u/{userId}")
    public Msg getUserinfo(@PathVariable("userId") String userId,@RequestHeader(name = "nickName") String currentLogUser){
        System.out.println(userId);
        Infos infos = infosService.getInfos(userId);
        MyUser user = infosService.getUserInfos(userId);
        Msg msg = new Msg();
        if (user.getId()!=null&&user.getId().length()>=1){
            msg.setCode(100);
            msg.setMessage("获取成功！");
            msg.getExtend().put("infos",infos);
            msg.getExtend().put("user",user);
        }else {
            msg.setCode(200);
            msg.setMessage("用户不存在！");
        }
        msg.getExtend().put("currentLogUser",currentLogUser);
        System.out.println(msg);
        return msg;
    }

    @GetMapping("/u/getArticleList")
    public Msg getArticleList(@RequestParam("userId" ) String userId,@RequestParam("currentPage") Integer currentPage){

        System.out.println("userId:"+userId);
        List<HomeArticle> articleList = infosService.getArticle(userId,currentPage);
        List<HomeArticle> newList = new ArrayList<>();
        Zan zan = new Zan();
        for (HomeArticle homeArticle : articleList) {
            Integer articleZan = zanDao.getArticleZan(homeArticle.getId());
            homeArticle.setLike(articleZan);
            newList.add(homeArticle);
        }

        Msg msg = new Msg();
        if (articleList.size()>0){
            msg.setCode(100);
            msg.setMessage("获取成功");
            msg.getExtend().put("list",articleList);
        }else if (articleList.size()==0){
            msg.setCode(100);
            msg.setMessage("没有文章了。。。");
        }else {
            msg.setCode(200);
            msg.setMessage("操作错误");
        }

        return msg;
    }



}
