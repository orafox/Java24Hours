package com.ch13;

public class TestPayIncreaseLambda {
    public static void main(String[] args) {
        Person workers[] = new Person[4];
        workers[0] = new Employee("eman", "mostafa");
        workers[1] = new Employee("eman", "taha");
        workers[2] = new Contractor("haya", "elmady");
        workers[3] = new Employee("shimma", "ahmed");
        Payable increaseRulesEmployee = (int percent)->{
            return true;}
        ;

        Payable increaseRulesContractor = (int percent)->{
            if (percent < Payable.INCREASE_CAP) {
                return true;
            }else {
                System.out.println("sorry can't increase hourly rate by more than" + Payable.INCREASE_CAP + "%");
                return false;
            }

        };
        for (Person p: workers
             ) {
            if ('E' == p.getWorkerStatus()) {
                p.validatePayIncrease(increaseRulesEmployee, 30);

            } else if ('C' == p.getWorkerStatus()) {
                p.validatePayIncrease(increaseRulesContractor, 30);
            }

        }

    }
}
