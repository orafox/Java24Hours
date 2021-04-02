package com.ch11;

public class Order {
    public Object price;
    int numOflover , numOfwife;
    String msg;

    public Order(int numOflover, int numOfwife, String msg) {
        this.numOflover = numOflover;
        this.numOfwife = numOfwife;
        this.msg = msg;
    }

    public Order() {
    }

}
