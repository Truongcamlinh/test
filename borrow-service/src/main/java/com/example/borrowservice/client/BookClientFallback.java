package com.example.borrowservice.client;

import com.example.borrowservice.dto.BookDto;
import org.springframework.stereotype.Component;

@Component
public class BookClientFallback implements BookClient {

    @Override
    public BookDto getBookById(Long id) {
        // Fallback khi book-service không khả dụng
        return null;
    }
}
