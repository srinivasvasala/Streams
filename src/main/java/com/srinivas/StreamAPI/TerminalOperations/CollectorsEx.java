package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsEx {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,4,5,2,5,3,6,7);
        Set<Integer> numSet = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(numSet);
    }
}
