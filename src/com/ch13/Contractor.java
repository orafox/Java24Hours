package com.ch13;

public class Contractor extends Person implements Payable {
    public Contractor(String fName, String sName) {
        super(fName, sName, 'C');
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent<Payable.INCREASE_CAP) {
            System.out.println("Increasin hourly rate by " + percent + "%." + getPerson());
            return true;
        } else {
            System.out.println("sorry can't increase hourly rate more than " + Payable.INCREASE_CAP + " %" + getPerson());
            return false;
        }


    }

}
