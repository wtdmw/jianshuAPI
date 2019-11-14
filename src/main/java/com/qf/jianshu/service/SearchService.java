package com.qf.jianshu.service;


import java.util.List;

public interface SearchService {
    List searchNoteList(String value);
    List searchUserList(String value);
    List searchCollectionList(String value);
}
