package com.edusol.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

// Path variable  "/endpoint/{name}"

    @RequestMapping("path_variable/{name}")
    public String hello(@PathVariable String name){

        return "Welcome to Path Variable "+name;
    }


    @RequestMapping("/eligible/{age}")
    public String checkAge(@PathVariable int age){

        if(age>18){

            return "Eligible for voting with Age: "+age;
        }
        else {
            return "Not Eligible for voting with Age: "+age;
        }
    }

    @RequestMapping("/product/{price}/{name}")
    public String checkPrice(@PathVariable double price,@PathVariable String name){

        if(price<5000){
            return "Product is not costly :"+price + name;
        }
        else {
            return "Product is  costly :"+price +name ;
        }
    }


}
