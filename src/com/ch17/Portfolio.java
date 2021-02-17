package com.ch17;

public class Portfolio extends Thread {
    public Portfolio(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("you have 500 shares of IBM");
    }
}
