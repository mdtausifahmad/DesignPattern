package com.pattern.behavioral.templatemethod;

public abstract class Develop {

    public void code(){
        keyInCode();
        compileCode();
        testCode();
    }

    public abstract void compileCode();

    public abstract void testCode();

    public abstract void keyInCode() ;
}
