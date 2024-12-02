package com.project.chatembed.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatembedController {

    @GetMapping("/healthCheck")
    public ResponseEntity<String>healthCheck(){
        return ResponseEntity.status(200).body("healthCheck");
    }

}
