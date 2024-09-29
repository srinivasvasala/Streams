package com.srinivas.StreamAPI.IntermediateOperations;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEx {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(3, 5, 7, 3, 2, 7, 4, 5);
        List<Integer> sortedNums = nums.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNums);
    }

}
