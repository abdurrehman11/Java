package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

        List<Student> studentList  = new ArrayList<>();

        studentList.add(new Student("PK", 23));
        studentList.add(new Student("KK", 26));
        studentList.add(new Student("MK", 23));
        studentList.add(new Student("SK", 21));
        studentList.add(new Student("RK", 40));
        studentList.add(new Student("BK", 30));

        Stream<Student> parallelStream = studentList.parallelStream();
        System.out.println("Students data sent for processing.");
        parallelStream.forEach(s -> doProcess(s));
    }

    private static void doProcess(Student s) {
        System.out.println(s);
    }
}
