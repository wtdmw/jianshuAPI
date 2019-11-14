package com.qf.jianshu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.jianshu.entity.SearchCollection;
import com.qf.jianshu.entity.SearchNote;
import com.qf.jianshu.entity.SearchUser;
import com.qf.jianshu.mapper.SearchMapper;
import com.qf.jianshu.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List searchNoteList(String value) {
        value = "%" + value + "%";
        List<SearchNote> searchNotes = searchMapper.searchNoteList(value);
        return searchNotes;


    }

    @Override
    public List searchUserList(String value) {
        value = "%" + value + "%";
        List<SearchUser> searchUsers = searchMapper.searchUserList(value);
        return searchUsers;
    }

    @Override
    public List searchCollectionList(String value) {
        value = "%" + value + "%";
        List<SearchCollection> searchCollections = searchMapper.searchCollectionList(value);
        return searchCollections;
    }
}

