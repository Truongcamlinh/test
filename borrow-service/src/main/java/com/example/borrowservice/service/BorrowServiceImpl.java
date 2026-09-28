package com.example.borrowservice.service;

import com.example.borrowservice.client.BookClient;
import com.example.borrowservice.dto.BookDto;
import com.example.borrowservice.dto.BorrowResponse;
import com.example.borrowservice.dto.CreateBorrowRequest;
import com.example.borrowservice.entity.BorrowRecord;
import com.example.borrowservice.repository.BorrowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {

    private final BorrowRepository borrowRepository;
    private final BookClient bookClient;
    private final KafkaProducerService kafkaProducerService;

    @Override
    @Transactional
    public BorrowResponse createBorrowRecord(CreateBorrowRequest request) {
        // TODO PHẦN 1.1: Gọi bookClient để lấy thông tin sản phẩm sách
        // - Nếu bookClient trả về null (fallback do service sập), ném IllegalStateException("Dich vu Book Service hien khong kha dung")
        // - Nếu book.getAvailableQuantity() <= 0, ném IllegalArgumentException("Sach da het, khong the muon")

        // TODO PHẦN 1.2: Tạo và lưu BorrowRecord với trạng thái "BORROWED", borrowDate là LocalDateTime.now()

        // TODO PHẦN 1.3: Gọi kafkaProducerService gửi thông báo studentEmail qua topic "borrow-created"

        // TODO PHẦN 1.4: Trả về BorrowResponse với thông tin tương ứng

        return null; // Thay đổi dòng này khi hoàn thiện
    }
}
