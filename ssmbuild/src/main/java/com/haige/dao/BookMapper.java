package com.haige.dao;

import com.haige.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @className: com.haige.dao-> BookMapper
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 21:23
 * @version: 1.0
 * @todo:
 */
public interface BookMapper {
    /*增加一本书*/
    int addBook(Books books);
    /*删除一本书*/
    int deleteBook(@Param("bookId") int id);
    /*更新一本书*/
    int updateBook(Books books);
    /*查询一本书*/
    Books queryBookById(@Param("bookId") int id);
    /*查询所有书*/
    List<Books> queryAllBooks();

    List<Books> queryBookByName(@Param("bookName") String bookName);
}
