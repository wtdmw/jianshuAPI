package com.qf.jianshu.controller;


import com.qf.jianshu.entity.Message;
import com.qf.jianshu.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;


    @RequestMapping("/search")
    public Message getList(String keyword,@RequestParam(required = false,defaultValue = "note") String method) {
          if(!keyword.equals("")){
            System.out.println(keyword+method);
            if ("note".equals(method)) {
                List searchNoteList = searchService.searchNoteList(keyword);
                return Message.sucess().add("searchNoteList", searchNoteList);
            } else if ("user".equals(method)) {
                List searchUserList = searchService.searchUserList(keyword);
                return Message.sucess().add("searchUserList", searchUserList);
            } else if ("collection".equals(method)) {
                List searchCollectionList = searchService.searchCollectionList(keyword);
                return Message.sucess().add("searchCollectionList", searchCollectionList);
            }
        }
        return null;
    }
}
