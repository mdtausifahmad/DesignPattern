package com.pattern.behavioral.strategy;

public class DevelopJavaCodeWithGradleAndSpock extends Develop {

    @Override
    public void compileCode() {
        System.out.println("Run gradle");
    }

    @Override
    public void testCode() {
        System.out.println("Run Spock");
    }

    @Override
    public void keyInCode() {
        System.out.println("code Java with test");
    }
}
