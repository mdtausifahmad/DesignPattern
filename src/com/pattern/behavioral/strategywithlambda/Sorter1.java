package com.pattern.behavioral.strategywithlambda;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Sorter1 implements Sorter {
    @Override
    public List<Integer> sort(List<Integer> results) {

        System.out.println("Using sorter1");
        return results
                .stream()
                .sorted()
                .collect(toList());
    }
}
