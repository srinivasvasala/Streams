package com.srinivas.StreamAPI.Problems;

import java.util.List;
import java.util.stream.Collectors;
public class maxMin {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
