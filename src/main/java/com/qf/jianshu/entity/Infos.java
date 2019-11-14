package com.qf.jianshu.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Infos {
    private Integer follow;
    private Integer flower;
    private Integer articleCount;
    private Integer like;

}
