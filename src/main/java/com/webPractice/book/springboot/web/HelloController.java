package com.webPractice.book.springboot.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/api/hello")
    public String hello2(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";


    }
}
