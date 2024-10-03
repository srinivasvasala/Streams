package com.srinivas.StreamAPI.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class sortValues {
    public static void main(String[] args) {
        List<Person > persons = Arrays.asList(
            new Person("Srinivas", 25, "USA"),
            new Person("Ramesh", 30, "India"),
            new Person("Suresh", 35, "UK")
        );
        List<Person> sortedPersons = persons.stream()
                .mapToInt(p -> p.getAge())
                .sorted()
                .mapToObj(age -> persons.stream().filter(p -> p.getAge() == age).findFirst().get())
                .collect(Collectors.toList());
        System.out.println(sortedPersons);



    }
}
