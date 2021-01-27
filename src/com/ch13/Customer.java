package com.ch13;

public class Customer {
    String name;
    double grossIncome;

    public void applyTaxCalcFunction(TaxFunction taxFunc) {
        double calclatedTax = taxFunc.calcTax(grossIncome);
        System.out.println("the calculated tax for " + name + " is " + calclatedTax);
    }
}
