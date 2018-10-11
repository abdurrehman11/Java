package com.infotech;

public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 7 / a;
            System.out.println("After Exception");

        } catch (ArithmeticException ex) {
            System.out.println("Division by zero.");
            ex.printStackTrace();
        }

        System.out.println("After catch statement.");
    }
}
