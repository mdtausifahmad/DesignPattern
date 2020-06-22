package com.pattern.behavioral.strategy;

public class Client {
    public static void work(Develop develop){
        develop.code();
    }

    public static void main(String[] args) {
       work(new Develop(new MavenBuild(),new TestWithJunit()));

       work(new Develop(new GradleBuild(),new TestWithJunit()));
    }
}
