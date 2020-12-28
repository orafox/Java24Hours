package com.ch06;

public class Contractor extends Person implements Payable {
    String fullName;

    public Contractor() {

    }

    public Contractor(String fName, String lName) {
        fullName = fName + " " + lName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean increasePay() {
        return false;
    }

    @Override
    public boolean increaseSalary(int prcentage) {
        System.out.println("increasing salary by " + prcentage + getfName());
        return true;
    }
}
