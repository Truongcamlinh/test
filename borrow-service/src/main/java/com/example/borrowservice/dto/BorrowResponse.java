package com.example.borrowservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BorrowResponse {
    private Long id;
    private String studentId;
    private String studentEmail;
    private Long bookId;
    private String bookTitle;
    private LocalDateTime borrowDate;
    private String status;
}
