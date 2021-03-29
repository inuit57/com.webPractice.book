package com.webPractice.book.springboot.web;

import com.webPractice.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    //book Study 브랜치 생성
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/api/hello")
    public String hello2(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name ,
                                     @RequestParam("amount") int amount ){
        return new HelloResponseDto(name, amount);
    }

}
