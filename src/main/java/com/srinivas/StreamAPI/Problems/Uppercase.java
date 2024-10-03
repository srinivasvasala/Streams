package com.srinivas.StreamAPI.Problems;

import java.util.Arrays;
import java.util.List;

public class Uppercase {

    public static void main(String[] args) {
        List<String > names = Arrays.asList("Srinivas", "Rama", "Sita", "Lakshman");
        List<String>  uppercaseNames = names.stream()
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(uppercaseNames);
    }
}
