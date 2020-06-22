package com.pattern.behavioral.strategy;

public class DevelopJavaCodeWithMaven extends Develop {

    @Override
    public void compileCode() {
        System.out.println("Run maven");
    }

    @Override
    public void testCode() {
        System.out.println("Run Junit");
    }

    @Override
    public void keyInCode() {
        System.out.println("code Java with test");
    }
}
