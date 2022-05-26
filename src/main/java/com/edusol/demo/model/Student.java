package com.edusol.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STUDENT_7PM")
public class Student {

    @Id// this will make this column as primary key
    @GeneratedValue // Automatically increment current 1,2,3,......14,15
    Long id;// primary key unique value
    private String name;
    private int age;
    @Column(name="STD_SECTION")
    private String section;

    // default constructor
    public Student() {
    }

    // param constructor


    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
