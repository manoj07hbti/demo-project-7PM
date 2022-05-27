package com.edusol.demo.controller;

import com.edusol.demo.model.Student;
import com.edusol.demo.service.StudentDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {



    @Autowired
    StudentDBService service;
    //CREATE or ADD to DB
    @PostMapping("add_student_db")
    public String add(@RequestBody Student student){

        return service.add(student);
    }

   //READ
    @GetMapping("get_all_student")
    public List<Student> getAllStudent(){

        return service.getAllStudent();
    }

    //UDPATE
    @PutMapping("update_student_db")
    public String updateStudent(@RequestParam Long id,@RequestParam String name){

       return service.updateStudent(id,name);
    }

    //DELETE

    @DeleteMapping("delete_student_db")
    public String delete(@RequestParam Long id){


        return service.deleteById(id);

    }

}
