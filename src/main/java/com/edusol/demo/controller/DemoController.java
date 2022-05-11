package com.edusol.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // step 1 use this annotation on top of class
public class DemoController {


    // method to print Hello Spring boot in console
   @RequestMapping("/hello") // step 2 use this annotation to create endpoint
    public void hello(){

        System.out.println("Hello Spring Boot.....");
    }

    // print out put on browser

    @RequestMapping("/welcome")
    public String welcome(){

       return  "Welcome to Spring Boot";
    }

    //endpoint

    @RequestMapping("/int_value")
    public int demo(){

       return 33;
    }

}
