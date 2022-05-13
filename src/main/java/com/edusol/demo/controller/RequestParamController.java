package com.edusol.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {


    @RequestMapping("/msg")
    public String  hello(@RequestParam String message){

        return "Welcome to Request param "+message;
    }


    @RequestMapping("/addition")
    public String add(@RequestParam int a,@RequestParam int b){

        return "Addition is :"+(a+b);
    }
}
