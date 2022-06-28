package com.example.mailses.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private String eventType;
    private String recipientEmail;
    private String status;
    private String action;
    private String feedbackId;
    private LocalDateTime localDateTime;
    private String senderName;
    private String senderMail;
    private String domain;
    private String messageType;

}
