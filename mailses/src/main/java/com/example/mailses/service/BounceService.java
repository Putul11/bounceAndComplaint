package com.example.mailses.service;

import com.example.mailses.domain.Bounce;
import com.example.mailses.repository.BounceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BounceService {
    private final BounceRepository bounceRepository;

    public BounceService(BounceRepository bounceRepository) {
        this.bounceRepository = bounceRepository;
    }

    public Bounce addBounceData(Bounce bounce){
        bounce.setBounceType(bounce.getBounceType());
        bounce.setBounceSubType(bounce.getBounceSubType());
        bounce.setTimeStamp(LocalDateTime.now());
        String feedbackId = UUID.randomUUID().toString();
        bounce.setFeedbackId(feedbackId);
        bounce.setBounceRecipient(bounce.getBounceRecipient());
        return bounceRepository.save(bounce);
    }
    public Bounce getBounceByBounceType(String bounceType){
        return bounceRepository.findByBounceType(bounceType);
    }
}
