package com.nit.springbootjpamongodbcrud.repositories;

import com.nit.springbootjpamongodbcrud.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
