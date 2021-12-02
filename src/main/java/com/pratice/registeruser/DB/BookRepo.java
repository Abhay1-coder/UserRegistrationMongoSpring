package com.pratice.registeruser.DB;

import com.pratice.registeruser.Model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, String> {    
}
