package com.qf.jianshu.vo;


import com.qf.jianshu.entity.TComment;
import com.qf.jianshu.entity.TUser;
import lombok.Data;

@Data
public class CommentVo extends TComment {
    private TUser user;
}
