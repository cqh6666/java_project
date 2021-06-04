package com.haige.service;

import com.haige.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @className: com.haige.service-> BookService
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 21:38
 * @version: 1.0
 * @todo:
 */
public interface BookService {

    /*增加一本书*/
    int addBook(Books books);
    /*删除一本书*/
    int deleteBook(int id);
    /*更新一本书*/
    int updateBook(Books books);
    /*查询一本书*/
    Books queryBookById(int id);
    /*查询所有书*/
    List<Book> queryAllBooks();
}
