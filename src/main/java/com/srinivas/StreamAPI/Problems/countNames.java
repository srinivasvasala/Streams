package com.srinivas.StreamAPI.Problems;

import java.util.Arrays;
import java.util.List;

public class countNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srinivas","rajesh","raju","srikanth","nagaraju");
        int count = names.stream()
                .filter(n -> n.startsWith("s"))
                .mapToInt(n -> 1)
                .sum();
        System.out.println(count);

    }
}
