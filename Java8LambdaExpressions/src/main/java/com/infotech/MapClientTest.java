package com.infotech;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClientTest {

    public static void main(String[] args) {

        Map<Integer,Employee> map = new HashMap<>();
        map.put(19022, new Employee("Sean", "sean.m@gmail.com", 90000.00));
        map.put(19044, new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
        map.put(19055, new Employee("Martin", "martin.m300@gmail.com", 80000.00));

        Set<Entry<Integer, Employee>> entrySet = map.entrySet();
        System.out.println("\n-------------Iterate Map Method 1 -------------------------");
        for (Entry<Integer, Employee> entry: entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Integer> keys = map.keySet();
        System.out.println("\n-------------Iterate Map Method 2 -------------------------");
        for (Integer key: keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        System.out.println("\n-------------Iterate Map Method 3 (lambda expressions) -------------------------");
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

    }
}
