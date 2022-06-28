//package com.example.mailses;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//
//@Configuration
//public class EmailConfig {
//
//    @Bean
//    public AmazonSimpleEmailService amazonSimpleEmailService() {
//
//        return AmazonSimpleEmailServiceClientBuilder.standard()
//                .withCredentials(
//                        new AWSStaticCredentialsProvider(
//                                new BasicAWSCredentials(
//                                        awsAccessKey, awsSecretKey)))
//                .withRegion(Regions.EU_WEST_1)
//                .build();
//    }
//    @Bean
//    public JavaMailSender javaMailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
//        return new SimpleEmailServiceJavaMailSender(amazonSimpleEmailService);
//    }
//
//}
