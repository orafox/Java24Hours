package com.ch17;

public class TestThread4Lambda {
    public static void main(String[] args) {
        Runnable mn = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("the market is improving " + i);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread marketNews = new Thread(mn, "Market News");
        marketNews.start();

        Runnable port = ()->{
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("you have " + (500 + i) + " shares of IBM");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        };
        Thread portfolio = new Thread(port, "Portfolio data");
        portfolio.start();
        System.out.print("the main method of testThread is finished");

     }
}
