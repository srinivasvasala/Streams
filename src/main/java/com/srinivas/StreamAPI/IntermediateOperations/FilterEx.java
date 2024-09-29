package com.srinivas.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,2,5,6,7,8,9,10);
        List<Integer> evenList = list.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);

    }
}
