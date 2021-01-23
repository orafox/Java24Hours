package com.ch12;

public class Customer {
    String a, b;

    public Customer(String a, String b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}
