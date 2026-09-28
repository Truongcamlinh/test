package com.example.bookservice.service;

import com.example.bookservice.dto.BookResponse;

public interface BookService {
    BookResponse getBookById(Long id);
}
