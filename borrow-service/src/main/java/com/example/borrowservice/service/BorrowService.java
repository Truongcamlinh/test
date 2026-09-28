package com.example.borrowservice.service;

import com.example.borrowservice.dto.BorrowResponse;
import com.example.borrowservice.dto.CreateBorrowRequest;

public interface BorrowService {
    BorrowResponse createBorrowRecord(CreateBorrowRequest request);
}
