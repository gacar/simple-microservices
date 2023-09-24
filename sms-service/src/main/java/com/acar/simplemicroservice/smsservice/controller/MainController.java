package com.acar.simplemicroservice.smsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/sendSms")
    public String sendMessage(@RequestParam(value = "name", defaultValue = "Empty Message") String message) {
        System.out.println("email message is sending ...");
        return "SMS is sending, Message:" + message;
    }
}
