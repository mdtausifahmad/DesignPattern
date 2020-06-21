package com.pattern.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        ComputerA computer1 = new ComputerA();

        createComputer(computer1);
        System.out.println(computer1);

    }

    private static void createComputer(ComputerA computer) {
        computer.add(new CPUA());
        computer.add(new MemoryA());
    }
}
