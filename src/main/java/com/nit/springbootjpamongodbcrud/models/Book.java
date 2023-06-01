package com.nit.springbootjpamongodbcrud.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Book")
public class Book {

    @Id
    @JsonProperty("book_id")
    private String bookId;

    @JsonProperty("book_name")
    private String bookName;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("publication")
    private String publication;

    @JsonProperty("price")
    private Double price;

}
