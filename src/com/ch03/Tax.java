package com.ch03;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public double calcTax() {
//        return 256.3;
        //
        if (grossIncome <= 500000) {
            return grossIncome * 0.06;

        } else {
            return grossIncome * 0.08;

        }

    }

}
