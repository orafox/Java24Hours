package com.ch06;

public class Contractor extends Person implements Payable {
    @Override
    public boolean increasePay() {
        return false;
    }
String fullName;
    public Contractor() {

    }

    public Contractor(String fName, String lName) {
fullName = fName+" "+lName;
    }
}
