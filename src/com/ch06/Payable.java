package com.ch06;

public interface Payable {
    default boolean increasePay() {
        System.out.println("the default code implement pay increase goes here");
        return true;
    }

    static double checkThePayIncreaseLimit() {
        return 12345.00;
    }
}
