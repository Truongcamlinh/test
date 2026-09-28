package com.example.borrowservice.controller;

import com.example.borrowservice.dto.BorrowResponse;
import com.example.borrowservice.dto.CreateBorrowRequest;
import com.example.borrowservice.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/borrows")
@RequiredArgsConstructor
public class BorrowController {

    private final BorrowService borrowService;

    @PostMapping
    public ResponseEntity<BorrowResponse> createBorrowRecord(@RequestBody CreateBorrowRequest request) {
        BorrowResponse response = borrowService.createBorrowRecord(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
