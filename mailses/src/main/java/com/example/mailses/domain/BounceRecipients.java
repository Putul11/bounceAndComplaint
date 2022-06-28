package com.example.mailses.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BounceRecipients {
    private String email;
    private String action;
    private String status;
}
