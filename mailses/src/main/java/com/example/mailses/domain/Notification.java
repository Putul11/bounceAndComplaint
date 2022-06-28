package com.example.mailses.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private String eventType;
    private Bounce bounce;
    private String senderName;
    private String senderMail;
    private String domain;


}
