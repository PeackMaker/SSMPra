package com.win.ssm.service;

import com.win.ssm.dao.BookMapper;
import com.win.ssm.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
@Service("bookServiceImpl")

public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Integer insertOne(Book book) {
        return bookMapper.insertOne(book);
    }

    @Override
    public Integer deleteByName(String bookName) {
        return bookMapper.deleteByName(bookName);
    }

    @Transactional
    @Override
    public Integer updateOne(Book book) {
        System.out.println(book);
        return bookMapper.updateOne(book);
    }

    @Override
    public Integer queryCount() {
        return bookMapper.queryCount();
    }

    @Override
    public Book queryByName(String bookName) {
        return bookMapper.queryByName(bookName);
    }

    @Override
    public List<Book> queryAll() {
        return bookMapper.queryAll();
    }
}
