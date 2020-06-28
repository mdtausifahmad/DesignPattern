package com.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> task = new ArrayList<>();
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            Callable c  = () -> {
                counter.increment();
                return counter.getCounter();
            };

            task.add(c);

        }

        List<Future<Integer>> futures = service.invokeAll(task);
        futures.forEach(integerFuture -> {
            try {
                System.out.println(integerFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        service.shutdown();
        System.out.println(counter.getCounter());
    }
}
