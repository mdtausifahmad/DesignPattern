package com.pattern.creational.abstractfactory;

public abstract class Computer {
    private CPU _cpu;
    private Memory _memory;

    @Override
    public String toString() {
        return String.format("%s %s %s",getClass(),_cpu,_memory);
    }

    public void add(CPU cpu) {
        _cpu = cpu;
    }

    public void add(Memory memory) {
        _memory = memory;
    }

    public abstract String getPartsType();
}
