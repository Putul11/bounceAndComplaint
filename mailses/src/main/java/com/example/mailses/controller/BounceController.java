package com.example.mailses.controller;

import com.example.mailses.domain.Bounce;
import com.example.mailses.service.BounceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BounceController {
    private final BounceService bounceService;

    public BounceController(BounceService bounceService) {
        this.bounceService = bounceService;
    }

    @PostMapping("/addBounceData")
    public Bounce addBounceData(@RequestBody Bounce bounce){
        return bounceService.addBounceData(bounce);
    }

}
