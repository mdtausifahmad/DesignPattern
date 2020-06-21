package com.pattern.creational.abstractfactory;

public abstract class CPU {
    @Override
    public String toString() {
        return String.format("%s  %d", getClass(), hashCode());
    }
}
