package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
class UserRestController{

    @GetMapping("/user")
    public ResponseEntity<?> set(){
        return new ResponseEntity<>("gfdsgdsfgsdfgsdfgsgf", HttpStatus.OK);
    }
}
