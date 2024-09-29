package com.srinivas.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,3,4,5,5,6,7);
        List<Integer> distNums = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distNums);
    }
}
