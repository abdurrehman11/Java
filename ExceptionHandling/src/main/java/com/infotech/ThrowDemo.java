package com.infotech;

public class ThrowDemo {

    public static void main(String[] args) {

        ThrowDemo t = new ThrowDemo();
        try {
            t.display();
        } catch (RuntimeException ex) {
            System.out.println("Exception caught in the catch block of main method.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void display() {
        try {
            throw new RuntimeException("Runtime exception occurred in display method.");
        } catch (RuntimeException ex) {
            System.out.println("Exception caught in the catch block of display method.");
            throw ex;
        }
    }
}
