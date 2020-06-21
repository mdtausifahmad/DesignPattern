package com.pattern.creational.abstractfactory;

public class ComputerA {
    private CPUA _cpu;
    private MemoryA _memory;

    @Override
    public String toString() {
        return String.format("%s %s %s",getClass(),_cpu,_memory);
    }

    public void add(CPUA cpu) {
        _cpu = cpu;
    }

    public void add(MemoryA memory) {
        _memory = memory;
    }
}
