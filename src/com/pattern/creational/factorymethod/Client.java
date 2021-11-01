package com.pattern.creational.factorymethod;

import com.pattern.creational.factorymethod.employee.Developer;
import com.pattern.creational.factorymethod.employee.Employee;
import com.pattern.creational.factorymethod.employee.SalesExecutive;

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
