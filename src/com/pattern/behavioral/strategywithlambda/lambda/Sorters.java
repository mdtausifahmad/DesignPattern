package com.pattern.behavioral.strategywithlambda.lambda;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sorters {

    public static List<Integer> sort1(List<Integer> results) {

        System.out.println("Using sorter1");
        return results
                .stream()
                .sorted()
                .collect(toList());
    }

    public static List<Integer> sort2(List<Integer> results) {
        System.out.println("Using sorter2");
        return results
                .stream()
                .sorted()
                .collect(toList());
    }
}
