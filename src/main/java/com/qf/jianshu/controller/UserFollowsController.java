package com.qf.jianshu.controller;

import com.qf.jianshu.entity.JsSpecial;
import com.qf.jianshu.entity.User;
import com.qf.jianshu.entity.UserFollows;
import com.qf.jianshu.service.UserFollowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserFollowsController {
    @Autowired
    private UserFollowsService userFollowService;

    @GetMapping("/userFollows")
    public ResponseEntity<Object> userFollows(@RequestHeader(name = "nickName") String nickName){
        System.out.println(nickName);
        List<UserFollows> userFollowsList = userFollowService.userFollowsList(nickName);
        List<JsSpecial> userSpecialList = userFollowService.userSpecialList(nickName);
        Map<String, Object> map = new HashMap<>();
        map.put("userFollows",userFollowsList);
        map.put("userSpecial",userSpecialList);


        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
