package com.ch17;

public class PortfolioVolatile extends Thread {
    private volatile Thread stopMe;


    public PortfolioVolatile(String name) {
        super(name);
    }

    public void stopMe() {
        stopMe = null;
    }

    @Override
    public void run() {
        stopMe  = Thread.currentThread();
        while (stopMe == Thread.currentThread()) {
            System.out.println("the Portfolio thread is running");
        }
        System.out.println("the Portfolio thread was killed");
    }
}
