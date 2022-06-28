package com.example.mailses.repository;

import com.example.mailses.domain.Bounce;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BounceRepository extends MongoRepository<Bounce, String> {
    Bounce findByBounceType(String bounceType);

    Bounce findByBounceSubType(String bounceSubType);
}
