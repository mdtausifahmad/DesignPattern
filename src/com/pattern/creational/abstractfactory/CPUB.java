package com.pattern.creational.abstractfactory;

public class CPUB {
    @Override
    public String toString() {
        return String.format("%s  %d", getClass(), hashCode());
    }
}
