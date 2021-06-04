package com.haige.service;

import com.haige.dao.BookMapper;
import com.haige.pojo.Books;

import java.awt.print.Book;
import java.util.List;

/**
 * @className: com.haige.service-> BookServiceImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 21:47
 * @version: 1.0
 * @todo:
 */
public class BookServiceImpl implements BookService {

    /**
     * Service调Dao层：组合Dao
     * @param books
     * @return
     */

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
