package com.pattern.behavioral.strategy;

public class GradleBuild implements Build{
    @Override
    public void runBuild() {
        System.out.println("Gradle Build");
    }
}
