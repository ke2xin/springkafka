package com.example.springkafka.controller;

import com.example.springkafka.provider.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @Autowired
    private KafkaSender sender;
    @RequestMapping("/")
    public String index(){
        return  "首页";
    }

    @RequestMapping("/send")
    public String send(){
        sender.send();
        return  "send";
    }
}
