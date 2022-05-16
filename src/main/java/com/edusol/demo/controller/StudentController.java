package com.edusol.demo.controller;

import com.edusol.demo.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

     ArrayList <Student> studentArrayList= new ArrayList<>();
    //CRUD

    // CREATE

    @RequestMapping("/add_student")
    public String addStudent(){

        Student student= new Student("Raj",23,"CS");
        studentArrayList.add(student);
        return "Student Added Successfully ....";
    }

    //R-> READ OR GET
    @RequestMapping("/get_all")
    public  ArrayList <Student> getStudentArrayList(){

        return studentArrayList;
    }

    // U-> UPDATE
    @RequestMapping("update_student")
    public String updateStudent(@RequestParam String name){

        studentArrayList.get(0).setName(name);

        return "Name updated Successfully as "+name;
    }

    //D-> DELETE
    @RequestMapping("/delete_student/{index}")
    public String remove(@PathVariable int index){

        studentArrayList.remove(index);

        return "Student removed successfully....";
    }

}
