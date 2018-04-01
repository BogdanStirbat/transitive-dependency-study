package com.bstirbat.transitive.dependency.study.messagewebapplication.controller;


import com.bstirbat.transitive.dependency.study.MessageServiceV1;
import com.bstirbat.transitive.dependency.study.MessageServiceV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message/v1")
    public String getMessageV1() {
        return MessageServiceV1.getMessage();
    }

    @GetMapping("/message/v2")
    public String getMessageV2() {
        return MessageServiceV2.getMessage();
    }
}
