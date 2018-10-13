package com.infotech;

public class ClientTest {

    public static void main(String[] args) {
        int a = 2, b = 4, sum = 0;

        // By using lambda expression, we have avoided one (dot class) file here.
//        createThreadWithoutLambda();
        createThreadUsingLambda();

        // Anonymous class for implementing functional interface
        MyInterface1 myInterface1 = new MyInterface1() {

            @Override
            public void method1() {
                System.out.println("Method executes using anonymous class..");
            }
        };

        System.out.println("\n--------------------------------------");
        myInterface1.method1();

        // Instantiate Functional Interface using lambda expressions
        MyInterface1 myInterface2 = () -> System.out.println("Method executes using lambda expression..");

        System.out.println("\n--------------------------------------");
        myInterface2.method1();

        MyInterface2 i2 = (name) -> {
            System.out.println("In method2 of Functional interface 2");
            System.out.println("Your friend name :" + name);
        };

        System.out.println("\n--------------------------------------");
        i2.method2("Ahsan");

        // valid only in case of single parameter
        MyInterface2 singleParameter = name -> System.out.println("Your name is: " + name);

        System.out.println("\n--------------------------------------");
        singleParameter.method2("Bilal");

        // for multiple parameters
        MyInterface3 i3 = (name, age) -> {
            System.out.println("Your name is " + name);
            System.out.println("You are " + age + " years old.");
        };

        System.out.println("\n--------------------------------------");
        i3.method3("Ahsan", 23);

        // return from lambda expression
        MyInterface4 myInterface4 = (int num1, int num2) -> { return num1 + num2; };
        sum = myInterface4.sumOfNumbers(a, b);
        System.out.println("\n--------------------------------------");
        System.out.println("Sum of numbers: " + sum);

        MyInterface4 myInterface41 = (int num1, int num2) -> num1 + num2;
        sum = myInterface41.sumOfNumbers(a, b);
        System.out.println("\n--------------------------------------");
        System.out.println("Sum of numbers: " + sum);
    }

    private static void createThreadUsingLambda() {
        System.out.println("\n-------------------------------------------------");
        Runnable r = () -> System.out.println("MyThread is executing by using lambda expressions.");
        Thread thread1 = new Thread(r);
        thread1.start();
    }

    private static void createThreadWithoutLambda() {
        System.out.println("\n-------------------------------------------------------");
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.start();
    }

}
