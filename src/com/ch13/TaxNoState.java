package com.ch13;

public class TaxNoState {
    public static double calcTax(double grossIncome) {
        double federalTax = 0;
        if (grossIncome > 300000) {
            federalTax = grossIncome * 0.05;
        }else {
            federalTax = grossIncome * 0.06;
        }
        return federalTax;
    }
}
