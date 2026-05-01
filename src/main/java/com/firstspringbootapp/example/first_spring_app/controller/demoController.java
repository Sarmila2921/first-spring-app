package com.firstspringbootapp.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
// @RestController is the combiantion of @Controller + @ResponseController
@RestController
@RequestMapping("/demo/apis")
public class demoController {
    @GetMapping("/demo1")
    public  String demo1(){
        return "This is our demo1 API";
    }

    @GetMapping("/demo2")
    public String  demo2(){
        return "This is our demo2 API";
    }
}
