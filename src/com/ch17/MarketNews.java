package com.ch17;

public class MarketNews extends Thread {
    public MarketNews(String threadName) {
        super(threadName);
    }

    public MarketNews() {
        super("Em@n");

    }

    @Override
    public void run() {
        System.out.println("the stock market is Improving");

    }
}
