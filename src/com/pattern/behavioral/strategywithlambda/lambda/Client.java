package com.pattern.behavioral.strategywithlambda.lambda;

import com.pattern.behavioral.strategywithlambda.Algorithm2;
import com.pattern.behavioral.strategywithlambda.Sorter2;
import com.pattern.behavioral.strategywithlambda.Unit;

public class Client {

    public static void useUnit(com.pattern.behavioral.strategywithlambda.Unit unit){
        unit.performOperation(6)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

       useUnit(new Unit(Algorithms::fastComputeAlgorithm,Sorters::sort1));

       useUnit(new Unit(input -> Algorithms.fastComputeAlgorithm(input),
               input -> Sorters.sort1(input)));




    }
}
