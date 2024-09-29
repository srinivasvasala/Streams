package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class MinNdMax {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,4,4,5,2,5,3,6,7);

        Integer min = nums.stream().min(Integer::compareTo).get();
        Integer max = nums.stream().max(Integer::compareTo).get();

        System.out.println(min);
        System.out.println(max);
    }
}
