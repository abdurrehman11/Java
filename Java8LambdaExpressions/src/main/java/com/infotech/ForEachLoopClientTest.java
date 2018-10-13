package com.infotech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachLoopClientTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Sean", 45));
        students.add(new Student("Andrew", 40));
        students.add(new Student("Martin", 42));

        // forEach method(internally implements loop) has better performance as compare to external For Loop and Iterator
        System.out.println("\n--------------------------------------");
        students.forEach(student -> System.out.println(student));

        // more simplified way
        System.out.println("\n--------------------------------------");
        students.forEach(System.out::println);

        // external for loop
        System.out.println("\n--------------------------------------");
        for (Student student: students) {
            System.out.println(student);
        }

        // external iterator
        Iterator<Student> iterator = students.iterator();
        System.out.println("\n--------------------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
