package com.srinivas.StreamAPI.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice","bob","charlie");
        Optional<String> firstNameStartingWithA = names.stream()
                .filter(n -> n.startsWith("a"))
                .findFirst();
        System.out.println(firstNameStartingWithA);
    }
}
