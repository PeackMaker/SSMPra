package com.win.ssm.service;

import com.win.ssm.pojo.Book;

import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */

public interface BookService {


    Integer insertOne(Book book);

    Integer deleteByName(String bookName);

    Integer updateOne(Book book);

    Integer queryCount();

    Book queryByName( String bookName);

    List<Book> queryAll();

}
