package com.example.borrowservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBorrowRequest {
    private String studentId;
    private String studentEmail;
    private Long bookId;
}
