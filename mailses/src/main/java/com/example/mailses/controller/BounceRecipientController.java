package com.example.mailses.controller;

import com.example.mailses.domain.BounceRecipients;
import com.example.mailses.service.BouncerecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BounceRecipientController {

    @Autowired
    private BouncerecipientService bouncerecipientService;

    @PostMapping("/addBounceRecipient")
      public BounceRecipients addBouncerecipients(BounceRecipients bounceRecipients){
          return bouncerecipientService.addBounceRecipients(bounceRecipients);
      }
}
