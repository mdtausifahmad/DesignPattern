package com.pattern.behavioral.strategywithlambda;

public class Algorithm2 implements Algorithm {
    @Override
    public int compute(int input) {
        System.out.println("More accurate  ... ");
        return (int) (input * Math.random() * 100);
    }
}
