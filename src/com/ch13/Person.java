package com.ch13;

public class Person {
    String fName, sName;
    char status;

    public Person(String fName, String sName, char status) {
        this.fName = fName;
        this.sName = sName;
        this.status = status;
    }

    public Person() {


        super();
    }

    public char getWorkerStatus() {
        return status;
    }

    public String getPerson() {
        return fName + " " + sName;
    }

}
