package com.ch13;

public class Employee extends Person implements Payable {
    public Employee() {

    }

    public Employee(String fName, String sName) {
        super(fName, sName, 'E');

    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("increase salary by " + percent + " %" + getPerson());
        return true;
    }
}
