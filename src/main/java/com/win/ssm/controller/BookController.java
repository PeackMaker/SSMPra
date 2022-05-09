package com.win.ssm.controller;

import com.win.ssm.pojo.Book;
import com.win.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/7
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @GetMapping("/showAll")
    public String showAllBooks(Model model){
        List<Book> books = bookService.queryAll();
        model.addAttribute("books", books);
        return "booklist";
    }

    @RequestMapping("/toaddBook")
    public String toaddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){
        bookService.insertOne(book);
        return "redirect:/book/showAll";
    }

    @GetMapping("/toUpdateBook")
    public String toUpdateBook(String name,Model model){
        Book getBook = bookService.queryByName(name);
        System.out.println(getBook);
        model.addAttribute("getBook",getBook);
        return "updateBook";
    }

    @PostMapping("/updateBook")
    public String updateBook(Book book){
        System.out.println(book);
        Integer integer = bookService.updateOne(book);
        System.out.println(integer);
        return "redirect:/book/showAll";
    }

    @RequestMapping("/deleteBook/{bookName}")
    public String deleteBook(@PathVariable("bookName") String name){
        bookService.deleteByName(name);
        return "redirect:/book/showAll";
    }

    @PostMapping("/queryBook")
        public String queryBook(String bookName, Model model){
        Book book = bookService.queryByName(bookName);
        List<Book> list=new ArrayList<>();
        list.add(book);
        if(list==null){
            list=bookService.queryAll();
            model.addAttribute("err","未查到。。。");
        }
        model.addAttribute("books",list);
        return "booklist";
    }
}
