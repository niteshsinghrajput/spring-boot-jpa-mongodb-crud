package com.nit.springbootjpamongodbcrud.services;

import com.nit.springbootjpamongodbcrud.models.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Book createBook(Book book);
    List<Book> getBooks();
    Book getBookByBookId(String bookId);
    Book updateBook(String bookId, Book book);
    Book partialUpdateBook(String bookId, Map<String,Object> bookRequestPayload);
    boolean deleteBookId(String bookId);
}
