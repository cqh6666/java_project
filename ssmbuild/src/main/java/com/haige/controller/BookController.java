package com.haige.controller;

import com.haige.pojo.Books;
import com.haige.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.haige.controller-> BookController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 22:26
 * @version: 1.0
 * @todo:
 */

@Controller
@RequestMapping("/book")
public class BookController {
    /*Controller调用Service层*/

    @Autowired
    @Qualifier("BookService")
    private BookService bookService;

    //查询全部书籍，并展示
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> bookList = bookService.queryAllBooks();

        model.addAttribute("bookList",bookList);
        return "allBook";
    }

    // 增加书籍
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

    //增加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id){
        Books book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toDeleteBook")
    public String toDeleteBook(int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        List<Books> bookList = bookService.queryBookByName(queryBookName);
        if (bookList.size()==0){
            model.addAttribute("msg","not found!");
            bookList = bookService.queryAllBooks();
        }else{
            model.addAttribute("msg","found "+bookList.size()+" books!");
        }
        model.addAttribute("bookList",bookList);
        return "allBook";
    }
}
