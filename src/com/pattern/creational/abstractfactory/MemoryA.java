package com.pattern.creational.abstractfactory;

public class MemoryA {
    @Override
    public String toString() {
        return String.format("%s %d", getClass(),hashCode());
    }
}
