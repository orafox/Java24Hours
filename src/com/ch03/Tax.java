package com.ch03;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public Tax() {
    }

    public Tax(double grossIncome, int dependents) {
//        this.grossIncome = grossIncome;
//        this.dependents = dependents;

        this(grossIncome, "NY", dependents);
    }

    public Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state = state;
        this.dependents = dependents;
    }

    public double calcTax() {
//        return 256.3;
        //
        if (grossIncome <= 500000) {
            return grossIncome * 0.06;

        } else {
            return grossIncome * 0.08;

        }

    }

    void verifyTax() {
        SomeOtherClass s = new SomeOtherClass();
        s.verifyTax(this);
    }

}
