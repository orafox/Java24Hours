package com.ch13;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestIncreaseFunctionInterface {
    public static void main(String[] args) {
        final int INCREASE_CAP =20;
        int procposeIncrese =30;
        Person2 workers[] = new Person2[4];
        workers[0] = new Person2("eman taha", 'E');
        workers[1] = new Person2("eman mostafa", 'E');
        workers[2] = new Person2("shimma ahmed", 'E');
        workers[3] = new Person2("haya elamady", 'C');

        List<Person2> workList = Arrays.asList(workers);
        BiFunction<Person2,Integer,Boolean> IncreaseRulesEmployee = (pers,precent)->{
            System.out.println("increasing pay for     " + pers.getName() + " is valid");
            return true;

        };
        BiFunction<Person2,Integer,Boolean> IncreaseRulesContractor =(pers,precent)->{
            if (precent > INCREASE_CAP) {
                System.out.println("Sorry, can't increase hourly rate by more than "
                        + INCREASE_CAP+" %. for " + pers.getName());
                return false;
            }else
                return true;

        };

        workList.forEach(pers ->{
            if ('E' == pers.getWorkerStatus()) {
                pers.validateIncreasePay(IncreaseRulesEmployee, procposeIncrese);
            } else if ('C' == pers.getWorkerStatus()) {
                pers.validateIncreasePay(IncreaseRulesContractor, procposeIncrese);
            }
        });

    }
}
