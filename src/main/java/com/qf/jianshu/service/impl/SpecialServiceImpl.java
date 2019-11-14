package com.qf.jianshu.service.impl;


import com.qf.jianshu.entity.Special;
import com.qf.jianshu.mapper.SpecialMapper;
import com.qf.jianshu.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("specialService")
public class SpecialServiceImpl implements SpecialService {

    @Autowired
    private SpecialMapper specialDao;

    /**
     * 创建专题
     * @param special
     * @return
     */
    @Override
    public Integer addSpecial(Special special) {
        return specialDao.addSpecial(special);
    }

    /**
     * 专题信息
     * @param id
     * @return
     */
    @Override
    public Special collection_info(Integer id) {
        return specialDao.collection_info(id);
    }

}
