package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,4,5,2,5,3,6,7);
        int sum = nums.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
