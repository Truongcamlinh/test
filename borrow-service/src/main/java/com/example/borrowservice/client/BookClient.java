package com.example.borrowservice.client;

import com.example.borrowservice.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service", fallback = BookClientFallback.class)
public interface BookClient {

    @GetMapping("/api/v1/books/{id}")
    BookDto getBookById(@PathVariable("id") Long id);
}
