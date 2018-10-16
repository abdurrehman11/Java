package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SerialStream {

    public static void  main(String[] args) {

        // method1 for making stream
        String arr[] = new String[]{"AA", "AB", "AC"};
        Stream<String> stream1 = Arrays.stream(arr);
        System.out.println("\n-------------------------");
        stream1.forEach(System.out::println);

        // method2 for making stream
        Stream<String> stream2 = Stream.of("A", "B", "C", "D");
        System.out.println("\n-------------------------");
        stream2.forEach(System.out::println);

        // method3 for making stream
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Bilal");
        list.add("Daniyal");

        Stream<String> stream3 = list.stream();
        System.out.println("\n-------------------------");
        stream3.forEach(System.out::println);

    }
}
