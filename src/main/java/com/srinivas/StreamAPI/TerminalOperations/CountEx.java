package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("srinivas","rajesh","raju","srikanth","nagaraju");
        long count = names.stream().count();
        System.out.println(count);
    }
}
