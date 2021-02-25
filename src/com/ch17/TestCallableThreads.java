package com.ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestCallableThreads {
    public static void main(String[] args) {
        Callable<Integer> mn = () -> {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("the market is improving " + i);


            }
            return 12345;
        };

        Callable<Integer> port = () -> {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(700);
                System.out.println("you have " + (500 + i) + " shares of IBM ");

            }
            return 10;
        };

        List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
        List<Integer> results = new ArrayList<>();
        final ExecutorService service = Executors.newFixedThreadPool(1);
        try {
            futures.add(service.submit(port));
            futures.add(service.submit(mn));
            for (Future<Integer> future : futures
            ) {
                results.add(future.get());

            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
        for (Integer res : results) {
            System.out.println("\nGot the result: "+res);
        }
    }
}
