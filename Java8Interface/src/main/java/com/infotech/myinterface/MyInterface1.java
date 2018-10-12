package com.infotech.myinterface;

import com.infotech.model.Student;

import java.util.Collections;
import java.util.List;

public interface MyInterface1 {

    default List<Student> sortStudents (List<Student> studentList) {

        Collections.sort(studentList);
        return studentList;
    }

    default void display() {
        System.out.println("Display in interface 1");
    }

    static void greet(String name) {
        System.out.println("Welcome " + name);
    }

    Integer getMaxNum(List<Integer> intList);

    Integer getMinNum(List<Integer> intList);

}
