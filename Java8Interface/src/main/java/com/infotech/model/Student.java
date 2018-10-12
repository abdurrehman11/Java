package com.infotech.model;

public class Student implements Comparable<Student> {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // sort students by name
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
