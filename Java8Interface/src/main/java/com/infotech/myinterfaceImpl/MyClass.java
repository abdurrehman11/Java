package com.infotech.myinterfaceImpl;

import com.infotech.myinterface.FunctionalInterface1;
import com.infotech.myinterface.MyInterface1;
import com.infotech.myinterface.MyInterface2;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface1, MyInterface2, FunctionalInterface1 {

    @Override
    public Integer getMaxNum(List<Integer> intList) {
        Integer max = Collections.max(intList);
        return max;
    }

    @Override
    public Integer getMinNum(List<Integer> intList) {
        Integer min = Collections.min(intList);
        return min;
    }

    public static void greet(String name) {
        System.out.println("Welcome " + name);
    }

    @Override
    public void display() {

        MyInterface1.super.display();
        MyInterface2.super.display();
        System.out.println("Display in class");
    }

    @Override
    public void method1() {
        System.out.println("Override Method1 of Functional Interface 1");
    }

    public Integer calculateSum(int a, int b) {
        int sum = FunctionalInterface1.super.sum(a, b);
        return sum;
    }

}
