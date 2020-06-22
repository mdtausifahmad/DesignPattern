package com.pattern.behavioral.strategy;

public class Develop {

    private  Build _build;
    private  Test _test;

    public Develop(Build build, Test test) {
        _build = build;
        _test = test;
    }

    public void code(){
        keyInCode();
        _build.runBuild();
        _test.runTest();
    }

    private void keyInCode() {
        System.out.println("Code in Java");
    }

}
