package com.ch12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGenericCollection {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        Customer cust1 = new Customer("Eman", "Mos");
        Customer cust2 = new Customer("Eman", "taha");
        Customer cust3 = new Customer("Haya", "elmady");
        Customer cust4 = new Customer("Shimma", "Mostfa");

        customers.add(cust1);
        customers.add(cust2);
        customers.add(cust3);
        customers.add(cust4);
        Order ord1 = new Order();
        Iterator iterator = customers.listIterator();
        ProcessCustomers
                (customers);
        System.out.println(" = " + iterator.next());
        System.out.println(" = " + iterator.next());
        System.out.println(" = " + iterator.next());
        System.out.println(" = " + iterator.next());
//        iterator.next();
//        iterator.next();


//        customers.add(ord1);
        for (int i = 9; i >= 0; i--) {
            System.out.print(" " + i);
        }
    }

    private static void ProcessCustomers(List<?> customers) {
        for (Object custs : customers
        ) {
            System.out.println("iLove " + custs.toString());

        }
    }
}
