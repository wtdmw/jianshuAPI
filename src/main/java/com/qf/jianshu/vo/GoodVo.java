package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TGood;
import com.qf.jianshu.entity.TUser;
import lombok.Data;

@Data
public class GoodVo extends TGood {
    private TUser user;
}
