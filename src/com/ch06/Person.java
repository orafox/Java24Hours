package com.ch06;

public class Person {
    String fName ;
String lName ;
    public Person(String fName) {
        this.fName = fName;
    }

    public Person() {
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
