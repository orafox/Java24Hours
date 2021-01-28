package com.ch13;

import java.util.function.BiFunction;

public class Person2 {
    private String name ;
    private char workerStatus ;

    public Person2(String name, char workerStatus) {
        this.name=name;
        this.workerStatus = workerStatus;

    }

    public String getName() {
        return name;
    }

    public char getWorkerStatus() {
        return workerStatus;
    }

    public boolean validateIncreasePay(BiFunction<Person2, Integer, Boolean> func, int precent) {
        boolean isIncreseValid = func.apply(this, precent);
        System.out.println("increasing pay is " + (isIncreseValid ? "valid." : "is not valid"));
        return isIncreseValid;

    }
}
