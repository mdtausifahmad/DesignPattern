package com.pattern.behavioral.strategy;

public class DevelopJavaCode extends Develop {

    @Override
    public void compileCode() {
        System.out.println("Run javac");
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
