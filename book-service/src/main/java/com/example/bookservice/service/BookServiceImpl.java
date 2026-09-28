package com.example.bookservice.service;

import com.example.bookservice.dto.BookResponse;
import com.example.bookservice.entity.Book;
import com.example.bookservice.exception.BookNotFoundException;
import com.example.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    // TODO PHẦN 2: Thêm annotation Caching phù hợp để cache thông tin sách vào Redis
    // Tên cache (value/cacheNames): "books", key: id của sách
    @Override
    public BookResponse getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Khong tim thay sach voi ID: " + id));

        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .availableQuantity(book.getAvailableQuantity())
                .price(book.getPrice())
                .build();
    }
}
