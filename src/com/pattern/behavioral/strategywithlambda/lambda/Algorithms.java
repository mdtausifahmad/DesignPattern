package com.pattern.behavioral.strategywithlambda.lambda;

public class Algorithms {

    public static int fastComputeAlgorithm(int input) {
        System.out.println("Fast converging ... ");
        return (int) (input * Math.random() * 100);
    }

    public static int accurateComputeAlgorithm(int input) {
        System.out.println("More accurate  ... ");
        return (int) (input * Math.random() * 100);
    }
}
