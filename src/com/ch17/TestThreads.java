package com.ch17;

public class TestThreads {
    public static void main(String[] args) {
        MarketNews mn = new MarketNews("emy");
        mn.start();
        Portfolio p = new Portfolio("Portfolio data");
        p.start();
        System.out.println("TestThread Is Finished");

    }
}
