package com.concurrent.intro;

public class HappensBeforeSample {

    private static boolean done = false;
    private static int count = 0;


    public static void main(String[] args) throws InterruptedException {
        new  Thread(() -> runTillDone()).start();

        Thread.sleep(5000);
        System.out.println("Changing Done");
        done = true;
    }


    private static void runTillDone(){
        while (!done){
            count = count + 1;
        }
        System.out.println("Done!");
    }
}
