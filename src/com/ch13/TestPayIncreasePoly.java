package com.ch13;

public class TestPayIncreasePoly {
    public static void main(String[] args) {
        Payable workers[] = new Payable[4];
        workers[0] = new Employee("eman", "mostafa");
        workers[1] = new Employee("eman", "taha");
        workers[2] = new Contractor("haya", "elmady");
        workers[3] = new Employee("shimma", "ahmed");
        for (Payable p:
             workers) {
            p.increasePay(30);
        }


    }
}
