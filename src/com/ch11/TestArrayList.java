package com.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList customers = new ArrayList(20);
        Order order1 = new Order(123, 500, "IBM");
        Portfolio portfolio = new Portfolio(123);

        Customer cust1 = new Customer("eman", "shimma");
        Customer cust2 = new Customer("Nash", "shimma");
        customers.add(cust1);
        customers.add(cust2);
        Order ord = new Order();
        customers.add(ord);
        Map data = new HashMap();
        data.put("customer", cust1);
        data.put("Order", order1);
        data.put("Portfolio", portfolio);

        int totalElment = customers.size();
        System.out.println(totalElment);
        Customer currCustomer;
        for (int i = 0; i < totalElment; i++) {
            if (customers.get(i) instanceof Customer)
                currCustomer = (Customer) customers.get(i);
            else if (customers.get(i) instanceof Order) {
                Order currentOrder = (Order) customers.get(i);
            }
        }
    }
}
