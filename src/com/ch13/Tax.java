package com.ch13;

public class Tax {
    double grossIncome, federalTax;

    public void calcTax() {
        if (grossIncome < 300000) {
            federalTax = grossIncome * 0.05;

        }else {
            federalTax = grossIncome * 0.06;
        }
    }
}
