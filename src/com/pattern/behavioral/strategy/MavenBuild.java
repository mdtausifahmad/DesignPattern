package com.pattern.behavioral.strategy;

public class MavenBuild implements Build{
    @Override
    public void runBuild() {
        System.out.println("Run Maven");
    }
}
