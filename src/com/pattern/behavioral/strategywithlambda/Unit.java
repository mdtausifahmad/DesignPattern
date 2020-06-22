package com.pattern.behavioral.strategywithlambda;

import java.util.ArrayList;
import java.util.List;

public class Unit {

    private Algorithm algorithm;
    private Sorter sorter;

    public Unit(Algorithm algorithm, Sorter sorter) {
        this.algorithm = algorithm;
        this.sorter = sorter;
    }

    public List<Integer> performOperation(int input) {

        List<Integer> results = new ArrayList<>();
        for (int i=0; i< input; i++){
            results.add(algorithm.compute(input)+ 1);
        }

        return sorter.sort(results);

    }
}
