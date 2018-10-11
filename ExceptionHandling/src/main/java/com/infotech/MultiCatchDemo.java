package com.infotech;

public class MultiCatchDemo {

    private void calculateValue(int i) {
        int a[] = {0};
        try {
            int b = 7 / a[i];
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        MultiCatchDemo m = new MultiCatchDemo();
        m.calculateValue(0);
        m.calculateValue(2);
    }
}
