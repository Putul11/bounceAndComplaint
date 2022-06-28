package com.example.mailses.service;

import com.example.mailses.domain.Bounce;
import com.example.mailses.domain.BounceRecipients;
import com.example.mailses.repository.BounceRepository;
import com.example.mailses.repository.BouncerecipientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;

@Service
public class BouncerecipientService {

    private BouncerecipientRepository bouncerecipientRepository;
    private BounceRepository bounceRepository;

    public BouncerecipientService(BouncerecipientRepository bouncerecipientRepository, BounceRepository bounceRepository) {
        this.bouncerecipientRepository = bouncerecipientRepository;
        this.bounceRepository = bounceRepository;
    }
    public BounceRecipients addBounceRecipients(BounceRecipients bounceRecipients){
        bounceRecipients.setEmail(bounceRecipients.getEmail());
//        String[] bounceType = new String[]{"Permanent", "Transient"};
        String[] bounceSubtype = new String[]{"General", "NoEmail", "MailboxFull","MessageTooLarge","ContentRejected"};
        Bounce bounce = bounceRepository.findByBounceType("Permanent");
        if(bounce.getBounceType().contains("Permanent")){
            if ((bounce.getBounceSubType().contains(bounceSubtype[0])) || bounce.getBounceSubType().contains(bounceSubtype[1])){
                bounceRecipients.setStatus("failed");
                bounceRecipients.setAction("block");
            }
        }
        if (bounce.getBounceType().contains("Transient")) {
            if((bounce.getBounceSubType().contains(bounceSubtype[2])) ||
                    (bounce.getBounceSubType().contains(bounceSubtype[3])) ||
                    (bounce.getBounceSubType().contains(bounceSubtype[4]))){
                bounceRecipients.setStatus("failed");
                bounceRecipients.setAction("resend mail after some time"+ LocalDateTime.now().plusSeconds(2));
            }
        }
        else{
            bounceRecipients.setStatus("success");
            bounceRecipients.setAction("No action");
        }

        return bouncerecipientRepository.save(bounceRecipients);
    }
}
