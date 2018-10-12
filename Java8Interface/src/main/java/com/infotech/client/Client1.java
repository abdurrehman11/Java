package com.infotech.client;

import com.infotech.myinterface.FunctionalInterface1;
import com.infotech.myinterfaceImpl.MyClass;

public class Client1 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("\n----------------------------------------");

        myClass.method1();

        System.out.println("\n----------------------------------------");

        int a = 5, b = 7;
        System.out.println(myClass.calculateSum(a, b));
    }
}
