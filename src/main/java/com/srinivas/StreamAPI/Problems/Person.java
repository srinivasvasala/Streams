package com.srinivas.StreamAPI.Problems;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private String name;
    private int age;
   private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
