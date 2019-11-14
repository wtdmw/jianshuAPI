package com.qf.jianshu.service;


import java.util.List;

public interface SearchService {
    List searchNoteList(String value, Integer currentPage);
    List searchUserList(String value, Integer currentPage);
    List searchCollectionList(String value, Integer currentPage);
}
