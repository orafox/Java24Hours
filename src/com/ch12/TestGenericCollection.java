package com.ch12;

import java.util.ArrayList;
import java.util.List;

public class TestGenericCollection {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        Customer cust1 = new Customer("eman", "iman");
        Customer cust2 = new Customer("eman", "iman");
        customers.add(cust1);
        customers.add(cust2);
        Order ord1 = new Order();
//        customers.add(ord1);
        for (int i = 9; i >=0; i--) {
            System.out.print(" "+i);
        }
    }
}
