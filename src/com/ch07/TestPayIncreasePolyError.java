package com.ch07;

import com.ch06.Payable;

public class TestPayIncreasePolyError {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("john");
        workers[1] = new Contractor("Mary");
        workers[2] = new ForeinContractor("Eman");
        for (Person p :workers
             ) {
            ( p).increasePay(30);

        }
    }
}
