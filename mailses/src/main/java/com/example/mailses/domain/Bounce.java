package com.example.mailses.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bounce {
    private String bounceType;
    private String bounceSubType;
    private String bounceRecipient;
    private LocalDateTime timeStamp;
    private String feedbackId;
}
