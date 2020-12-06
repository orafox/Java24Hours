package com.ch03;

public class NJTax extends Tax {
    double adjustTax(double stateTax) {
        double adjustTax = stateTax-500;
        return adjustTax;
    }
}
