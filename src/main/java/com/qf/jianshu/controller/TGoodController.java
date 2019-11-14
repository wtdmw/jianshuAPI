package com.qf.jianshu.controller;


import com.qf.jianshu.entity.TGood;
import com.qf.jianshu.mapper.TGoodMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/good")
public class TGoodController {
    @Resource
    private TGoodMapper tgoodMapper;

    @RequestMapping(value = "/addGood",method = RequestMethod.POST)
    public void addGood(TGood good){
        tgoodMapper.addGood(good);
    }
    @RequestMapping(value = "/updateGood",method = RequestMethod.PUT)
    public void updateGood(TGood good){
        tgoodMapper.updateGood(good);
    }
}
