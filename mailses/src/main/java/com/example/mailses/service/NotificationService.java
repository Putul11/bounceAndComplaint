package com.example.mailses.service;

import com.example.mailses.domain.Bounce;
import com.example.mailses.domain.Notification;
import com.example.mailses.repository.BounceRepository;
import com.example.mailses.repository.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class NotificationService {
     @Autowired
     private final NotificationRepository notificationRepository;
     @Autowired
     private final BounceRepository bounceRepository;

    public NotificationService(NotificationRepository notificationRepository, BounceRepository bounceRepository) {
        this.notificationRepository = notificationRepository;
        this.bounceRepository = bounceRepository;
    }

    public Notification sendNotification(Notification notification, String bounceType){
        String[] states = new String[]{"Bounce", "Complaint"};
         notification.setEventType(notification.getEventType());
         if(notification.getEventType().contains(states[0])){
             Bounce bounce = bounceRepository.findByBounceType(bounceType);
             notification.setBounce(bounce);
         }
         notification.setSenderName(notification.getSenderName());
         notification.setSenderMail(notification.getSenderMail());
         notification.setDomain(notification.getDomain());
         return notificationRepository.save(notification);
     }

     public List<Notification> getNotificationByEvent(String eventType){
         return notificationRepository.findByEventType(eventType);
     }
//     public Notification getNotification(String messageType, String eventType){
//
//     }
}
