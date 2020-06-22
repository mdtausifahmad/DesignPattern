package com.pattern.behavioral.strategy;

public class DevelopJavaCodeWithMavenAndSpock extends Develop {

    @Override
    public void compileCode() {
        System.out.println("Run maven");
    }

    @Override
    public void testCode() {
        System.out.println("Run spock");
    }

    @Override
    public void keyInCode() {
        System.out.println("code Java with test");
    }
}
