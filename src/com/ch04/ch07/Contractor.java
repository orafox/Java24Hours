package com.ch04.ch07;

public class Contractor extends Person {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent < INCREASE_CAP) {
            System.out.println("increasing hourly rate by " + percent + " % " + getName());
            return true;
        }
        else {
            System.out.println("sorry can't increase hourly rate by more than " + INCREASE_CAP + " %" + getName());
            return false;
        }
    }
}
