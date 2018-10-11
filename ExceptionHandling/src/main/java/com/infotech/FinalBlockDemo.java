package com.infotech;

public class FinalBlockDemo {

    private void calculateValue(int i) {
        int a[] = {0};
        try {
            int b = 7 / a[i];
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("In the final block");
        }
    }

    public static void main(String[] args) {

        FinalBlockDemo f = new FinalBlockDemo();
        f.calculateValue(0);
        f.calculateValue(2);
    }
}
