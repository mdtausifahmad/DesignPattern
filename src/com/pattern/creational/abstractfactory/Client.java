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

    private static void createComputer(Computer computer) {
        if (computer instanceof ComputerA){
            computer.add(new CPUA());
            computer.add(new MemoryA());
        }else {
            computer.add(new CPUB());
            computer.add(new MemoryB());
        }

    }


}
