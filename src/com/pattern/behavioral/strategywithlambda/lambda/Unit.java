package com.pattern.behavioral.strategywithlambda.lambda;

import com.pattern.behavioral.strategywithlambda.Algorithm;
import com.pattern.behavioral.strategywithlambda.Sorter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Unit {
    private Function<Integer, Integer> algorithm;
    private Function<List<Integer>, List<Integer>> sorter;

    public Unit(Function<Integer, Integer> algorithm, Function<List<Integer>, List<Integer>> sorter) {
        this.algorithm = algorithm;
        this.sorter = sorter;

    }

    public List<Integer> performOperation(int input) {

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            results.add(algorithm.apply(input) + 1);
        }

        return sorter.apply(results);

    }
}
