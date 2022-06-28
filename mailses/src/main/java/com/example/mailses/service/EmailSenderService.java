//package com.example.mailses.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailSenderService {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void  sendMail(String toEmail,
//                          String body,
//                          String subject){
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setFrom("prachipriya297@gmail.com");
//        simpleMailMessage.setTo(toEmail);
//        simpleMailMessage.setText(body);
//        simpleMailMessage.setSubject(subject);
//
//        mailSender.send(simpleMailMessage);
//        System.out.println("mail sent");
//
//
//    }
//}
