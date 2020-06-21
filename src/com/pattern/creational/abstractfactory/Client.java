package com.pattern.creational.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ComputerA computer1 = new ComputerA();
        createComputer(computer1);
        System.out.println(computer1);


        ComputerB computer2 = new ComputerB();
        createComputer(computer2);
        System.out.println(computer2);

    }

    private static void createComputer(Computer computer) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String partsType = computer.getPartsType();
        computer.add((CPU) Class.forName("com.pattern.creational.abstractfactory.CPU" + partsType).getDeclaredConstructor().newInstance());
        computer.add((Memory) Class.forName("com.pattern.creational.abstractfactory.Memory" + partsType).getDeclaredConstructor().newInstance());
    }


}
