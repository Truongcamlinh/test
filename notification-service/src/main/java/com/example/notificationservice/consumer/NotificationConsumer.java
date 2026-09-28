package com.example.notificationservice.consumer;

import com.example.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificationService;

    // TODO PHẦN 4: Lắng nghe topic "borrow-created" từ Kafka và gọi notificationService.sendEmailNotification(...)
    // Khai báo annotation @KafkaListener phù hợp
    public void consumeBorrowEvent(String studentEmail) {
        log.info("Nhan duoc message tu topic borrow-created: {}", studentEmail);
        notificationService.sendEmailNotification(studentEmail);
    }
}
