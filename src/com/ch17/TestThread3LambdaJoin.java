package com.ch17;

public class TestThread3LambdaJoin {
    public static void main(String[] args) {
        Runnable mn = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);

                    System.out.println("the market is improving " + i);

                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
        };
        Runnable port = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    {
                        Thread.sleep(700);
                        System.out.println("you have " + (500 + i) + "shares of IBM");
                    }


                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
        };
        Thread marketNews = new Thread(mn,"market news");
        Thread portfolio = new Thread(port, "portfolio data");
        marketNews.start();
        portfolio.start();
        try {
            marketNews.join();
            portfolio.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the main thread finished");

    }
}
