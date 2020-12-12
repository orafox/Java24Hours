package com.ch03;

public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();
        t.grossIncome = 500000;
        t.dependents = 2;
        t.state = "NJ";
        double yourTax = t.calcTax();
        System.out.println("your tax is " + yourTax);
        int totalOrderPrice = 400;

        double centigrees = WeatherReport.convertToVelsius(98.7);
        System.out.print(centigrees);
//        if (totalOrderPrice > 100) {
//            System.out.println("you will get a 20% discount");
//
//        } else {
//            System.out.println("order books for more than a " + "100$ to get 20 % discount ");
//        }
//        int taxCode = t.getCode(grossIncome);


    }
}
