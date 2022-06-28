package com.example.mailses.repository;

import com.example.mailses.domain.BounceRecipients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouncerecipientRepository extends MongoRepository<BounceRecipients, String> {
}
