package com.ch07;
import com.ch07.Person;
import com.ch07.Contractor;
import com.ch07.Employee;
public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[4];
        workers[0] = new Employee("john");
        workers[1] = new Employee("eman");
        workers[2] = new Contractor("steve");
        workers[3] = new Employee("shimma");
        for (Person p : workers) {
            p.promote(30);

        }
    }
}
