package com.pattern.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {

        ComputerA computer1 = new ComputerA();
        createComputer(computer1);
        System.out.println(computer1);


        ComputerB computer2 = new ComputerB();
        createComputer(computer2);
        System.out.println(computer2);
    }

    private static void createComputer(ComputerA computer) {
        computer.add(new CPUA());
        computer.add(new MemoryA());
    }

    private static void createComputer(ComputerB computer) {
        computer.add(new CPUB());
        computer.add(new MemoryB());
    }
}
