package com.advanceauto.hackathon.gamification.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GamificationController {

    @GetMapping("/gamification")
    public ResponseEntity<String> gamificationData() {
        return new ResponseEntity<String>("Gamification App", HttpStatus.OK);
    }
}
