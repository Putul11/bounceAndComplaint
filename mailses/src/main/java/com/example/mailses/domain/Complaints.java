package com.example.mailses.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Complaints {
    private String complainedRecipients;
    private LocalDateTime timeStamp;
    private String feedBackId;
    private String complaintFeedbackType;

}
