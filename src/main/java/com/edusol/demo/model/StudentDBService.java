package com.edusol.demo.model;

import com.edusol.demo.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDBService {

    @Autowired
    StudentJpaRepository repository;

    public String add(Student student){

        repository.save(student);// add object to database as a row
       return "Successfully stored in DB";
    }

    public List<Student> getAllStudent(){

        return repository.findAll();// fetch all records from DB
    }

    public String updateStudent(Long id,String name){

        //step 1: find the object in database
        Student student=repository.getById(id);// finding object from DB based on given id
        student.setName(name);
        //step 2: save the object
        repository.save(student);
        return "Successfully update name as: "+name;
    }

    public String deleteById(Long id){

        repository.deleteById(id);
        return "Successfully deleted student ";
    }
}
