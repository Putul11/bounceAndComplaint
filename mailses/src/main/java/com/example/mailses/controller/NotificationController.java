package com.example.mailses.controller;

import com.example.mailses.domain.Notification;
import com.example.mailses.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/sendNotification/")
    public Notification sendNotification(@RequestBody Notification notification,
                                         @RequestParam String bounceType){
        return notificationService.sendNotification(notification, bounceType);
    }

//    @GetMapping("/getNotification")
//    public Notification getNotification(@RequestParam String messageType, @RequestParam String eventType){
//        return notificationService.getNotification(messageType, eventType);
//    }

}
