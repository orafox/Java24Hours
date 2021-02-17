package com.ch17;

public class TestThreads3Lambda {
    public static void main(String[] args) {
        Thread mn = new Thread(() -> System.out.println("the stock market is improving  "), "Market news");
        mn.start();
        Thread p = new Thread(() -> System.out.println("You have 500 shares of IBM "), "Portfolio data");
        p.start();
        System.out.println("TestThread2Lambda");

    }
}
