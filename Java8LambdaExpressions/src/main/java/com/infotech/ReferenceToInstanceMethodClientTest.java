package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethodClientTest {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bean", 27));
        persons.add(new Person("Sean", 21));
        persons.add(new Person("Martin", 45));
        persons.add(new Person("Frank", 27));

        System.out.println("-------------------------------------------\n");
        System.out.println(persons);

        // efficient way of filtering properties from list
        List<String> personNames = ReferenceToInstanceMethodClientTest.getPersonNames(persons, Person::getName);

        System.out.println("-------------------------------------------\n");
        System.out.println(personNames);
    }

    private static List<String> getPersonNames(List<Person> personList, Function<Person, String> f) {
        List<String> results = new ArrayList<>();
        personList.forEach(person -> results.add(f.apply(person)));
        return results;
    }
}
