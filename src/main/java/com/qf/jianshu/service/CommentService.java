package com.qf.jianshu.service;


import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Map;

public interface CommentService {


    /**
     * 查找收到的评论
     * */
    List<Map> commentsReceived(String nickName);

    /**
     * 查找收到的喜欢和赞
     * */
    List<Map> likesReceived(String nickName);
}
