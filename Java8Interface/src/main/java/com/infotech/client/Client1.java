package com.infotech.client;

import com.infotech.myinterface.FunctionalInterface1;
import com.infotech.myinterfaceImpl.MyClass;

public class Client1 {

    public static void main(String[] args) {

        int a = 5, b = 7, sum = 0;
        MyClass myClass = new MyClass();
        System.out.println("\n----------------------------------------");

        myClass.method1();

        System.out.println("\n----------------------------------------");

        // Functional Interface can be instantiated using lambda expressions
        FunctionalInterface1 functionalInterface1 = () -> {
            System.out.println("Instantiated Functional Interface by using abstract method1 of Functional Interface");
        };

        functionalInterface1.method1();

        System.out.println("\n----------------------------------------");

        sum = functionalInterface1.sum(a, b);
        System.out.println("Sum using Functional interface instance: " + sum);

        System.out.println("\n----------------------------------------");

        sum = myClass.calculateSum(a, b);
        System.out.println("Sum using class instance: " + sum);
    }
}
