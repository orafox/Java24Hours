package com.ch06;

public class Employee
        extends Person implements Payable {
    String fName;

    public Employee() {

    }

    Employee(String fName, String lName) {
        fName = fName + " " + lName;
    }
}

