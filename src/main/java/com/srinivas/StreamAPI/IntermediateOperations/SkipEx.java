package com.srinivas.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> afterFive = nums.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(afterFive);
    }
}
