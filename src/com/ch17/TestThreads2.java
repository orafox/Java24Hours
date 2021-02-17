package com.ch17;

public class TestThreads2 {
    public static void main(String[] args) {
        MarketNews2 m2 =new MarketNews2();
        Thread m = new Thread(m2, "emyMarket");
        m.start();
        Runnable port2 = new Portfolio2();
        Thread p = new Thread(port2, "porot data");
        p.start();
        System.out.println("testThread2 is finished");

    }
}
