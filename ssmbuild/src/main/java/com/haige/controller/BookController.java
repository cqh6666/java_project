package com.haige.controller;

import com.haige.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
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
        List<Book> bookList = bookService.queryAllBooks();

        model.addAttribute("bookList",bookList);
        return "allBook";
    }
}
