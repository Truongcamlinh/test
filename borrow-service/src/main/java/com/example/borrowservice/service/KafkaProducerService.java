package com.example.borrowservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "borrow-created";

    // TODO PHẦN 3: Hoàn thiện phương thức gửi message studentEmail đến topic Kafka "borrow-created"
    public void sendBorrowNotification(String studentEmail) {
        // Viết mã phát sự kiện Kafka ở đây
    }
}
