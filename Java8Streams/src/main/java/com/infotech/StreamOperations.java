package com.infotech;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sean");
        list.add("Martin");
        list.add("Frank");
        list.add("Sean");
        list.add("Andrew");

        List<Student> studentList  = new ArrayList<>();
        studentList.add(new Student("PK", 23));
        studentList.add(new Student("KK", 26));
        studentList.add(new Student("MK", 23));
        studentList.add(new Student("SK", 21));
        studentList.add(new Student("RK", 40));
        studentList.add(new Student("BK", 30));
        studentList.add(new Student("DK", 80));

        List<String> uris = new ArrayList<>();
        uris.add("C:\\Myfile1.txt");
        uris.add("D:\\Myfile2.txt");
        uris.add("C:\\Myfile3.txt");

        Stream<String> stream = list.stream();
        Stream<String> distinct =  stream.distinct();
        long count = distinct.count();

        System.out.println("\n------------------------------------");
        System.out.println("Total Unique elements in stream: " + count);

        // same operations as above but by use chaining
        long distinctElements = list.stream().distinct().count();
        System.out.println("\n------------------------------------");
        System.out.println("Total Unique elements in stream: " + distinctElements);

        boolean containsChar = list.stream().anyMatch(s -> s.contains("ra"));
        System.out.println("\n------------------------------------");
        System.out.println("Stream contains specific(ra) char: " + containsChar);

        // filter stream
        Stream<Student> filteredStream = studentList.stream().filter(s -> s.getAge() > 25);
        System.out.println("\n------------------------------------");
        System.out.println("Filtered List on Age Criteria: ");
        filteredStream.forEach(System.out::println);

        boolean containsK = studentList.stream().allMatch(s -> s.getName().contains("K"));
        System.out.println("\n------------------------------------");
        System.out.println("All elements in stream contains K: " + containsK);

        boolean ageGreaterThan35 = studentList.stream().anyMatch(s -> s.getAge() > 35);
        System.out.println("\n------------------------------------");
        System.out.println("All student age > 35: " + ageGreaterThan35);

        boolean ageGreaterThan55 = studentList.stream().noneMatch(s -> s.getAge() > 55);
        System.out.println("\n------------------------------------");
        System.out.println("Any student age > 55: " + !ageGreaterThan55);

        Stream<Path> map = uris.stream().map(uri -> Paths.get(uri));
        System.out.println("\n------------------------------------");
        map.forEach(System.out::println);

        // map() stream example
        List<Integer> integerList = Arrays.asList(3, 6, 9, 12, 15);
        System.out.println("\n------------------------------------");
        integerList.stream().map(num -> num * 3).forEach(System.out::println);

        List<Detail> details =new ArrayList<>();

        List<String> parts1 = new ArrayList<>();
        parts1.add("Part_1");
        parts1.add("Part_2");
        parts1.add("Part_3");

        List<String> parts2 = new ArrayList<>();
        parts2.add("Part_1");
        parts2.add("Part_2");
        parts2.add("Part_3");
        parts2.add("Part_4");

        Detail detail1= new Detail(1001, parts1);
        Detail detail2= new Detail(1002, parts2);

        details.add(detail1);
        details.add(detail2);

        // if you want to make a single stream of all lists of a class
        Stream<String> flatMapStream = details.stream().flatMap(detail -> detail.getParts().stream());
        System.out.println("\n--------------Flat Stream of Lists----------------------");
        flatMapStream.forEach(System.out::println);

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        // reduce operation
        Integer sum = integers.stream().reduce(100, (x, y) -> x + y);
        System.out.println("\n------------------------------");
        System.out.println("Sum using reduce: " + sum);

        // collect operation (convert to list)
        List<String> namesList = new ArrayList<>();
        namesList.add("Sean");
        namesList.add("Martin");
        namesList.add("Frank");

        List<String> collect = namesList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("\n------------------------------");
        collect.forEach(System.out::println);
    }
}
