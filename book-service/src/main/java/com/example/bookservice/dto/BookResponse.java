package com.example.bookservice.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse implements Serializable {
    private Long id;
    private String title;
    private String author;
    private Integer availableQuantity;
    private Double price;
}
