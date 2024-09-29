package com.srinivas.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srinivas", "vasala", "java", "developer");
        List<Integer>nameLenths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLenths);
    }
}
