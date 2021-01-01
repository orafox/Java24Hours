package com.ch07;

public class ForeinContractor extends Person {
    public ForeinContractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("i'm just a foreign worker");

        return true;
    }
}
