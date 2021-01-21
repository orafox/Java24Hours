package com.ch11;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList passengerList = new LinkedList();
        passengerList.add("Eman");
        passengerList.add("Shimma");
        passengerList.add("Iman");
        passengerList.add("Nashwa");
        passengerList.add("Haya");
        ListIterator iterator = passengerList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }
}
