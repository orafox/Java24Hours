package com.ch13;

import java.util.Arrays;
import java.util.List;

public class TestCollectionForEach {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Person("Eman", "Mostafa",'E');
        workers[1] = new Person("eman", "taha",'E');
        workers[2] = new Person("shimma", "ahmed",'C');
        List<Person> workerList = Arrays.asList(workers);
        System.out.println("1. Running imperative loop");

        for (Person p :
                workerList) {
            if ('E' == p.getWorkerStatus()) {
                System.out.println(p.getPerson() + " is employee");

            } else if ('C' == p.getWorkerStatus()) {
                System.out.println(p.getPerson()+" is Contractor");
            }
        }
        System.out.println("2. Running functional loop");
        workerList.forEach(pers ->{
            if ('E' == pers.getWorkerStatus()) {
                System.out.println(pers.getPerson() + " is Employee");
            } else if ('C' == pers.getWorkerStatus()) {
                System.out.println(pers.getPerson() + " is Contractor");
            }
        });
    }
}
