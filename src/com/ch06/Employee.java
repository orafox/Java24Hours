package com.ch06;

public class Employee
        extends Person implements Payable {
    String fName;

    public Employee(String fName) {
        this.fName = fName;
    }

    public Employee() {
    }

    public Employee(String fName, String lName) {

        this.fName = fName + " " + lName;
    }

    @Override
    public String getfName() {
        return fName;
    }

    @Override
    public boolean increaseSalary(int prcentage) {
        System.out.println("Increasing salary by "+prcentage+" " +getfName());
        return true;
    }
}

