package com.infotech;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticMethodReferenceClientTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable command = () -> System.out.println("My task is executing using lambda expressions.");
        executorService.execute(command);

        System.out.println("\n-----------------------------------------------");

        Runnable command1 = StaticMethodReferenceClientTest::myRun;
        executorService.execute(command1);

    }

    private static void myRun() {
        System.out.println("\nMy task is executing using static method reference.");
    }
}
