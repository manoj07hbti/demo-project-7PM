package com.edusol.demo.service;

import com.edusol.demo.repository.AppArchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppArchService {

    //@Autowired
    //Classname ObjName;

    @Autowired
    AppArchRepo obj;

    public String response(){

        return obj.response();
    }
}
