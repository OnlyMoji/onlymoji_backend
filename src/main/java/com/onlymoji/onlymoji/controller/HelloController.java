package com.onlymoji.onlymoji.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "👋 안녕하세요! 이모지 SNS 서버입니다!";
    }
}
