package com.ch06;

public interface Payable {
    int ICREASE_CAP = 20;

    static double checkThePayIncreaseLimit() {
        return 12345.00;
    }

    default boolean increasePay() {
        System.out.println("the default code implement pay increase goes here");
        return true;
    }
}
