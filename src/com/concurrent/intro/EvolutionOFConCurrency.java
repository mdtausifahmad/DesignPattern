package com.concurrent.intro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvolutionOFConCurrency {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println(Thread.currentThread()));
        thread.start();

        System.out.println(Thread.currentThread());

        /**
         * creating a thread over and over again doesn't make any sense as it is less performing so we went for pool of threads
         */

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println(Thread.currentThread()));
        executorService.shutdown();


        /**
         * Thread pooling can create one problem That is called pool introduce deadlock
         * In this case and jobs are schedule in the pool It is possible That
         * all the Thread in the pool are busy.
         * To fix this problem Java 7 introduced fork join API
         */
    }
}
