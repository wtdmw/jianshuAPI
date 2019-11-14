package com.qf.jianshu.service;


import com.qf.jianshu.entity.TPicture;

import java.util.List;


public interface TPictureService {
    List<TPicture> findByAid(Integer aid);
}