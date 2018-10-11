package com.infotech;

import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        try {
            displayFileContent();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void displayFileContent() throws IOException, ArithmeticException {
        System.out.println("In displayFileContent method.");

        int a = 7;
        if (a < 6) {
            throw new IOException("File I/O exception has occurred.");
        } else {
            throw new ArithmeticException("ArithmeticException has occurred.");
        }
    }
}
