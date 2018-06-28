package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;

@RestController("/")
class UserRestController{

    @GetMapping("/user")
//    public ResponseEntity<?> set(@PathVariable("id") int id) throws InterruptedException {
    public ResponseEntity<?> set() throws InterruptedException {
        System.out.println("staaart");
        Date start = new Date();
        Thread.sleep(10000);
        Date end = new Date();
        long i = end.getTime() - start.getTime();
        return new ResponseEntity<>("trva : " + i + " start = " + start.toString(), HttpStatus.OK);
//        int i=10;
//        while (i>id){
//            i++;
//        }
//        return new ResponseEntity<>("gdgdfg", HttpStatus.OK);
    }
}
