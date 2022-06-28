package com.example.mailses.service;

import com.example.mailses.domain.Notification;
import com.example.mailses.repository.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class NotificationService {
     @Autowired
     private NotificationRepository notificationRepository;

     public Notification sendNotification(Notification notification){
         notification.setEventType(notification.getEventType());
         notification.setRecipientEmail(notification.getRecipientEmail());
         notification.setAction(notification.getAction());
         notification.setStatus(notification.getStatus());
         notification.setDomain(notification.getDomain());
         char[] chars1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
         StringBuilder sb = new StringBuilder();
         Random random = new SecureRandom();
         for (int i = 0; i < 15; i++) {
             char c = chars1[random.nextInt(chars1.length)];
             sb.append(c);
         }
         String output = sb.toString();
         notification.setFeedbackId(output);
         notification.setLocalDateTime(LocalDateTime.now());
         notification.setSenderName(notification.getSenderName());
         notification.setSenderMail(notification.getSenderMail());
         notification.setMessageType(notification.getMessageType());
         return notificationRepository.save(notification);
     }

     public List<Notification> getNotificationByEvent(String eventType){
         return notificationRepository.findByEventType(eventType);
     }
     public Notification getNotification(String messageType, String eventType){
         String Bounce = "";
         List<Notification> notification = notificationRepository.findByEventType(eventType);
         for(Notification notification1 : notification){
             if(notification1.getEventType().equals(Bounce)){
                 notification1.setStatus("block");
             }
             if(notification1.getMessageType().equals(messageType)){
                 return notification1;
             }
         }
         return null;
     }
}
