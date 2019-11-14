package com.qf.jianshu.service;


import com.qf.jianshu.entity.Special;

public interface SpecialService {
    Integer addSpecial(Special special);

    Special collection_info(Integer id);
}
