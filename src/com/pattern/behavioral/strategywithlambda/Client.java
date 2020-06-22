package com.pattern.behavioral.strategywithlambda;

public class Client {

    public static void useUnit(Unit unit){
        unit.performOperation(6)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
       //useUnit(new Unit(new Algorithm1(),new Sorter1()));
       useUnit(new Unit(new Algorithm2(),new Sorter2()));
    }
}
