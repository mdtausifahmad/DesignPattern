package com.pattern.creational.abstractfactory;

public class ComputerB {
    private CPUB _cpu;
    private MemoryB _memory;

    @Override
    public String toString() {
        return String.format("%s %s %s",getClass(),_cpu,_memory);
    }

    public void add(CPUB cpu) {
        _cpu = cpu;
    }

    public void add(MemoryB memory) {
        _memory = memory;
    }
}
