package com.pattern.creational.abstractfactory;

public class MemoryB {
    @Override
    public String toString() {
        return String.format("%s %d", getClass(),hashCode());
    }
}
