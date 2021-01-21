package com.ch11;

import java.util.*;

public class TestHashTable {
    public static void main(String[] args) {
        Hashtable customerData = new Hashtable();

        Customer customer = new Customer("David", "Lee");
        Order order = new Order();
        Portfolio portfolio = new Portfolio();

        Map data = new Hashtable();
        data.put("Customer", customer);
        data.put("Order",order);
        data.put("Portfolio", portfolio);

        Enumeration enumKey = customerData.keys();
        while (enumKey.hasMoreElements()) {
            System.out.println("hello there is more");

        }
        Enumeration enumElement = customerData.elements();
        ArrayList custIter = new ArrayList(10);
        Iterator iCust = custIter.iterator();
        while (iCust.hasNext()) {
            System.out.println(iCust.next());

        }

    }
}
