package com.qf.jianshu.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyUser {
    private String id;
    private String nickName;
    private String avatarPath;
    private String intro;
}
