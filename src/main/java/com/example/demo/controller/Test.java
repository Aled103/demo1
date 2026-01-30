package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Test {
    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "test";
    }
     public String test1(){
        System.out.println("test1");
        return "test1";
    }

}
