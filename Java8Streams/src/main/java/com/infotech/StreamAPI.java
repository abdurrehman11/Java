package com.infotech;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        Stream<String> stream = Stream.<String>builder().add("AB").add("AC").add("AD").build();
        System.out.println("\n-------------------------");
        stream.forEach(System.out::println);

        Stream<String> limit = Stream.generate(() -> "Hello").limit(5);
        System.out.println("\n-------------------------");
        limit.forEach(System.out::println);

        System.out.println("\n-------------------------");
        IntStream intStream = IntStream.range(1, 6);
        intStream.forEach(System.out::println);

        System.out.println("\n-------------------------");
        IntStream intStream1 = IntStream.rangeClosed(1, 6);
        intStream1.forEach(System.out::println);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(5);
        System.out.println("\n-------------------------");
        doubleStream.forEach(System.out::println);

        IntStream chars = "abcd".chars();
        System.out.println("\n-------------------------");
        chars.forEach(System.out::println);
    }
}
