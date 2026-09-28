package com.example.notificationservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    public void sendEmailNotification(String studentEmail) {
        log.info("[NOTIFICATION SERVICE] Gui email thong bao muon sach thanh cong toi sinh vien: {}", studentEmail);
    }
}
