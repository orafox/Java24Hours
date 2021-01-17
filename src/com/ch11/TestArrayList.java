package com.ch11;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList customers = new ArrayList(20);
        Customer cust1 = new Customer("eman", "shimma");
        Customer cust2 = new Customer("Nash", "shimma");
        customers.add(cust1);
        customers.add(cust2);
        Order ord = new Order();
        customers.add(ord);
        int totalElment = customers.size();
        System.out.println(totalElment);
        Customer currCustomer;
        for (int i = 0; i < totalElment; i++) {
            if (customers.get(i) instanceof Customer)
             currCustomer = (Customer) customers.get(i);
        }
    }
}
