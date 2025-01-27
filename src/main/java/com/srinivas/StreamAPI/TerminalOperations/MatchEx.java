package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class MatchEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,4,5,2,5,3,6,7);
        boolean hasEven  = nums.stream().anyMatch(n -> n%2 == 0);
        boolean allEven = nums.stream().allMatch(n -> n%2 == 0);
        boolean nonNegative = nums.stream().noneMatch(n -> n<0);
        System.out.println(hasEven);
        System.out.println(allEven);
        System.out.println(nonNegative);
    }
}
