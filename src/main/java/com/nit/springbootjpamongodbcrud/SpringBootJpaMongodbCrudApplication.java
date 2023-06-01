package com.nit.springbootjpamongodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaMongodbCrudApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringBootJpaMongodbCrudApplication.class, args);
		} catch (Exception ex) {
			System.out.println("ERROR: Error occurred : " + ex);
		}
	}

}
