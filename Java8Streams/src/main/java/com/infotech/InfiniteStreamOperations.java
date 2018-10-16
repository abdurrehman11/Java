package com.infotech;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamOperations {

    public static void main(String[] args) {

        System.out.println("\n-----------------Infinite Operation-------------------");
        Stream<Integer> iterate = Stream.iterate(0, i -> i + 2);
        List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("\n-------- Random Number Generation using streams ---------");
        Supplier<UUID> randomUUIDs = UUID::randomUUID;
        Stream<UUID> uuidStream = Stream.generate(randomUUIDs);
        List<UUID> uuidList = uuidStream.skip(10).limit(10).collect(Collectors.toList());
        uuidList.forEach(System.out::println);

        System.out.println("\n-------- Equivalent of Loop Using stream ---------");
        Stream<Integer> integerStream = Stream.iterate(0, i -> i + 1);
        integerStream.limit(10).forEach(System.out::println);
    }
}
