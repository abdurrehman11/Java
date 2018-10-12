package com.infotech.client;

import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface1;
import com.infotech.myinterfaceImpl.MyClass;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) {

        MyInterface1 myInterface = new MyClass();
        MyClass myClass = new MyClass();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Waqar", 30));
        students.add(new Student("Bilal", 23));
        students.add(new Student("Ali", 25));
        students.add(new Student("Sakhi", 27));

        System.out.println("----------------------------------------\n");

        List<Student> sortStudents = myInterface.sortStudents(students);
        for (Student student: sortStudents) {
            System.out.println(student.getName() + "\t" + student.getAge());
        }

        System.out.println("----------------------------------------\n");

        MyInterface1.greet("Ali");

        System.out.println("----------------------------------------\n");

        MyClass.greet("Bilal");

        System.out.println("----------------------------------------\n");

        List<Integer> intList = new ArrayList<>();
        intList.add(90);
        intList.add(70);
        intList.add(120);

        Integer max = myInterface.getMaxNum(intList);
        System.out.println("Max value: " + max);

        System.out.println("----------------------------------------\n");

        myClass.display();

        System.out.println("----------------------------------------\n");
    }

}
