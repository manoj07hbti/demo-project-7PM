package com.edusol.demo.model;

public class Student {

    private String name;
    private int age;
    private String section;

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
