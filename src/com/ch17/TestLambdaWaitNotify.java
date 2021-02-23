package com.ch17;

public class TestLambdaWaitNotify {
    private static Runnable getMktNewsRunnable(Object whoNotify) {
        return () ->{
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("the market is improving " + i);

                }

                synchronized (whoNotify) {
                    whoNotify.notify();
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + e.toString());
            }

        };
    }

    public static void main(String[] args) {
        TestLambdaWaitNotify thisInstance = new TestLambdaWaitNotify();
        Runnable marketNewsRunnable = getMktNewsRunnable(thisInstance);
        Thread marketNews = new Thread(marketNewsRunnable, "");
        marketNews.start();
        synchronized (thisInstance) {
            try {
                thisInstance.wait(20000);

            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
        System.out.println("this main method of test lambdaNotify is finished");

    }
}
