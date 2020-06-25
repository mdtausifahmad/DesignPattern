package com.concurrent.synchronizesuffer;

/**
 * Here changes made by main thread is not visible in Thread1
 * Soultion : using synchronized keyword
 */
public class SharedVariableVisibilitySolution2 {

    private static boolean done = false;
    private static int count = 0;

    public static synchronized boolean getDone() {
        return done;
    }

    public static synchronized void setDone(boolean value) {
        done = value;
    }

    public static void main(String[] args) throws InterruptedException {
        new  Thread(() -> runTillDone()).start();

        Thread.sleep(5000);
        System.out.println("Changing Done");
        setDone(true);
    }


    private static void runTillDone(){
        while (!getDone()){
            count = count + 1;
        }
        System.out.println("Done!");
    }
}
