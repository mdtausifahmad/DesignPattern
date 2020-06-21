package com.pattern.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {

        ComputerA computer1 = new ComputerA();
        createComputer(computer1,new ComputerFactoryA());
        System.out.println(computer1);


        ComputerB computer2 = new ComputerB();
        createComputer(computer2,new ComputerFactoryB());
        System.out.println(computer2);

    }

    private static void createComputer(Computer computer, ComputerFactory computerFactory) {
        computer.add(computerFactory.getCPU());
        computer.add(computerFactory.getMemory());
    }


}
