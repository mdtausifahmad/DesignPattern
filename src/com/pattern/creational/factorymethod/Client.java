package com.pattern.creational.factorymethod;

public class Client {

    public static void prepareEmployeeForTravel(Employee employee){
        employee.getReadyForTravel();
        System.out.println(employee);
    }

    public static void main(String[] args) {

        Developer developer = new Developer();
        prepareEmployeeForTravel(developer);

        SalesExecutive salesGuy = new SalesExecutive();
        prepareEmployeeForTravel(salesGuy);

    }
}
