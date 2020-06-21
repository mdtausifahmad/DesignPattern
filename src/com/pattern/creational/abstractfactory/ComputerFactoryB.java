package com.pattern.creational.abstractfactory;

public class ComputerFactoryB implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new CPUB();
    }

    @Override
    public Memory getMemory() {
        return new MemoryB();
    }
}
