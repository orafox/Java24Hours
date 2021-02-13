package com.ch04.ch07;

public abstract class Person {
    private String name;
    private String address;
    int INCREASE_CAP = 20;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is "+ name;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("new address is " + address);
    }

    private void giveDayOff() {
        System.out.println("Giving a day off to " + name);
    }

    public void promote(int Percent) {
        System.out.println("promoting a worker");
        giveDayOff();
        increasePay(Percent);
    }

    public abstract boolean increasePay(int percent);
}
