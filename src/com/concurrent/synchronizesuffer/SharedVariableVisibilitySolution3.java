package com.concurrent.synchronizesuffer;

/**
 * Here changes made by main thread is not visible in Thread1
 * Solution : We have to call a method which cross memory barrier
 */
public class SharedVariableVisibilitySolution3 {

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

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done!");
    }
}
