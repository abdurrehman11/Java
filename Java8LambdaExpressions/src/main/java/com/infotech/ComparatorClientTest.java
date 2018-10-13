package com.infotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorClientTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Sean", 45));
        students.add(new Student("Andrew", 40));
        students.add(new Student("Martin", 42));

        System.out.println("\n-------------- Student List ------------------------");
        students.forEach(student -> System.out.println(student));

        // sort collection using lambda expressions
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("\n---------- Student List after sort By Name ----------------");
        students.forEach(student -> System.out.println(student));


    }
}
