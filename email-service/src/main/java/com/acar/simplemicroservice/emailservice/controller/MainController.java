package com.acar.simplemicroservice.emailservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class MainController {

    @GetMapping("/sendEmail")
    public String sendMessage(@RequestParam(value = "message", defaultValue = "Empty Message") String message) {
        System.out.println("email message is sending ...");
        return "Email is sending, Message:" + message;
    }

}
