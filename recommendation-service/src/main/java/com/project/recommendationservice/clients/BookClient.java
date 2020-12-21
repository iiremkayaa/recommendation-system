package com.project.recommendationservice.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.recommendationservice.models.Book;

@FeignClient("book-service")
public interface BookClient {
	@GetMapping("/books")
	List<Book> getBookList(); 
}
