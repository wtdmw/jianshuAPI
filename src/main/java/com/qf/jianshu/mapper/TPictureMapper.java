package com.qf.jianshu.mapper;


import com.qf.jianshu.entity.TPicture;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TPictureMapper {
    List<TPicture> findByAid(Integer aid);
}