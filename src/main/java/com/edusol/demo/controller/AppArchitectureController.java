package com.edusol.demo.controller;

import com.edusol.demo.service.AppArchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchitectureController {

    //@Autowired
    //Classname ObjName;
    @Autowired
    AppArchService obj;

    @RequestMapping("/response")
    public String response(){

        //AppArchService obj= new AppArchService();

        return   obj.response();
    }


}
