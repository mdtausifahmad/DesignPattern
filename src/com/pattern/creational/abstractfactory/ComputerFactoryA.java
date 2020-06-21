package com.pattern.creational.abstractfactory;

public class ComputerFactoryA implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new CPUA();
    }

    @Override
    public Memory getMemory() {
        return new MemoryA();
    }
}
