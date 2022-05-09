package com.win.ssm.dao;

import com.win.ssm.pojo.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
@Repository
public interface BookMapper {

    @Insert("insert into t_book values (null,#{book.name},#{book.price},#{book.author},#{book.sales},#{book.stock},#{book.imgPath})")
    Integer insertOne(@Param("book") Book book);

    @Delete("delete from t_book where name=#{bookName}")
    Integer deleteByName(@Param("bookName") String bookName);

    @Update("update t_book set name=#{book.name},price=#{book.price},author=#{book.author},sales=#{book.sales},stock=#{book.stock} where id = #{book.id} ")
    Integer updateOne(@Param("book") Book book);

    @Select("select * from t_book")
    List<Book> queryAll();

    @Select("select * from t_book where name=#{bookName}")
    Book queryByName(@Param("bookName") String bookName);

    @Select("select count(*) from t_book")
    Integer queryCount();
}
