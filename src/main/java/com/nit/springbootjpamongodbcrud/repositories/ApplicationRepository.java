package com.nit.springbootjpamongodbcrud.repositories;

import com.nit.springbootjpamongodbcrud.models.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends MongoRepository<Application, String> {
}
