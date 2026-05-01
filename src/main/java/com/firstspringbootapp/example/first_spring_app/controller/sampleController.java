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
@RequestMapping("/sample/apis")
public class sampleController {

    @GetMapping("/sample1")
    public  String sample1(){
        return "This is our Sample1 API";
    }

    @GetMapping("/sample2")
    public String  sample2(){
        return "This is our Sample2 API";
    }
}
