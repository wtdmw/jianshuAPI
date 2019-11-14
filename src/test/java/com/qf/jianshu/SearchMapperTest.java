package com.qf.jianshu;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.qf.jianshu.entity.SearchCollection;
import com.qf.jianshu.entity.SearchNote;
import com.qf.jianshu.entity.SearchUser;
import com.qf.jianshu.mapper.SearchMapper;
import com.qf.jianshu.service.SearchService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest

public class SearchMapperTest {
    @Autowired
    private SearchMapper searchMapper;
    @Autowired
    private SearchService searchService;
    @Test
    public void test1(){
        PageHelper.startPage(1,11);
        List<SearchNote> notes = searchMapper.searchNoteList("%为何%");
        PageInfo pageInfo=new PageInfo(notes,5);

        System.out.println(pageInfo);
    }
    @Test
    public void test2() {
        List<SearchUser> searchUsers = searchMapper.searchUserList("%小%");
        System.out.println(searchUsers);
    }

    @Test
    public void test3(){
        PageHelper.startPage(1,2);
        List<SearchCollection> searchCollections = searchMapper.searchCollectionList("%V%");
        PageInfo pageInfo=new PageInfo(searchCollections);
        System.out.println(pageInfo);

    }
    @Test
    public void test4(){


    }
}