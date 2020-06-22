package com.pattern.behavioral.templatemethod;

public class Client {
    public static void work(Develop develop){
        develop.code();
    }

    public static void main(String[] args) {
        work(new DevelopJavaCode());
        work(new DevelopCSCode());
    }
}
