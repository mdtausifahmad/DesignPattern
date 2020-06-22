package com.pattern.behavioral.strategywithlambda;

public class Algorithm1 implements Algorithm {

    @Override
    public int compute(int input) {
        System.out.println("Fast converging ... ");
        return (int) (input * Math.random() * 100);
    }
}
