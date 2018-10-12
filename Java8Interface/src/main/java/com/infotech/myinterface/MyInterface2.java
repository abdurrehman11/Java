package com.infotech.myinterface;

public interface MyInterface2 {

    default void display() {
        System.out.println("Display in interface 2");
    }
}
