package com.pattern.behavioral.templatemethod;

public class DevelopCSCode extends Develop {
    @Override
    public void compileCode() {
        System.out.println("Compile Cs");
    }

    @Override
    public void testCode() {
        System.out.println("Run nunit");
    }

    @Override
    public void keyInCode() {
        System.out.println("Code cs");
    }
}
