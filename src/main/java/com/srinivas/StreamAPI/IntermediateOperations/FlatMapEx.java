package com.srinivas.StreamAPI.IntermediateOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        List<Integer> flattenMap = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flattenMap);
    }
}
