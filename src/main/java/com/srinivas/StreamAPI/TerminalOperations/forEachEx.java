package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class forEachEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,4,5,2,5,3,6,7);
        nums.stream().forEach(System.out::println);
    }
}
