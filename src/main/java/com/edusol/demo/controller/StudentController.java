package com.edusol.demo.controller;

import com.edusol.demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

     ArrayList <Student> studentArrayList= new ArrayList<>();
    //CRUD

    // CREATE

    @RequestMapping(value = "/add_student", method =RequestMethod.POST)
    public String addStudent(@RequestBody Student student){
        studentArrayList.add(student);
        return "Student Added Successfully ....";
    }

    //R-> READ OR GET
    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    public  ArrayList <Student> getStudentArrayList(){

        return studentArrayList;
    }

    // U-> UPDATE
    @RequestMapping(value = "update_student", method = RequestMethod.PUT)
    public String updateStudent(@RequestParam String name){

        studentArrayList.get(0).setName(name);

        return "Name updated Successfully as "+name;
    }

    //D-> DELETE
    @RequestMapping(value = "/delete_student/{index}",method = RequestMethod.DELETE)
    public String remove(@PathVariable int index){

        studentArrayList.remove(index);

        return "Student removed successfully....";
    }

}
