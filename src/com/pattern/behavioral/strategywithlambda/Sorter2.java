package com.pattern.behavioral.strategywithlambda;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sorter2 implements Sorter {
    @Override
    public List<Integer> sort(List<Integer> results) {
        System.out.println("Using sorter2");
        return results
                .stream()
                .sorted()
                .collect(toList());
    }
}
