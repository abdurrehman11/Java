package com.infotech.myinterface;

@FunctionalInterface
public interface FunctionalInterface1 {

    // can contain only one abstract method
    // public and abstract -> by default
    void method1();

    // can contain all methods of "Object class" as abstract
    int hashCode();

    boolean equals(Object obj);

    // can create any number of default methods
    default Integer sum(int a, int b) {
        return a + b;
    }
}
