package com.example.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
    @Autowired
    private fignclient fignclient;
    @GetMapping("/greet")
    public String greet(){
       String welmsg = fignclient.welcome();
       String greetmsg = "greet from spring cloud";
        return welmsg + greetmsg;
    }
}
