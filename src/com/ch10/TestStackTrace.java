package com.ch10;

public class TestStackTrace {
    public TestStackTrace() {
        divideByZero();
    }

    public static void main(String[] args) {
        new TestStackTrace();
    }

    int divideByZero() {
        return 25 / 0;
    }

//    public void getCustomers() {
//        try {
//            fileCustomer.read();
//        }


    }


