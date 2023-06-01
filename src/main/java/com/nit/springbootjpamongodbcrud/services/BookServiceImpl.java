package com.nit.springbootjpamongodbcrud.services;

import com.nit.springbootjpamongodbcrud.models.Book;
import com.nit.springbootjpamongodbcrud.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookByBookId(String bookId) {
        return repository.findById(bookId).get();
    }

    @Override
    public Book updateBook(String bookId, Book book) {
        Book existingBook = repository.findById(bookId).get();
        if(existingBook != null) {
            existingBook.setBookName(book.getBookName());
            existingBook.setAuthorName(book.getAuthorName());
            existingBook.setPublication(book.getPublication());
            existingBook.setPrice(book.getPrice());
            return repository.save(existingBook);
        }
        return null;
    }

    @Override
    public Book partialUpdateBook(String bookId, Map<String, Object> bookRequestPayload) {
        if(bookId != null && bookRequestPayload != null) {
            Book existingBook = repository.findById(bookId).get();
            for(Map.Entry<String, Object> bookData: bookRequestPayload.entrySet()) {

            }
        }
        return null;
    }



    @Override
    public boolean deleteBookId(String bookId) {
        return false;
    }
}
