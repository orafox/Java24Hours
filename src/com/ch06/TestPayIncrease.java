package com.ch06;

import java.math.BigDecimal;

public abstract class TestPayIncrease implements Payable{

public static void main(String[] args) {
    TestPayIncrease testPayIncrease = new TestPayIncrease() {
        @Override
        public boolean increaseSalary(int prcentage) {
            return false;
        }
    };
    System.out.println(testPayIncrease.getFactorial(10000));
    NJTax myTax1 = new NJTax();
    Tax MyTax2 =new NJTax();
    Object MyTax3 = new NJTax();

    Person workers[] = new Person[20];
//   workers[0] =new Employee("Yakov","Fain") ;

    Employee myEmp = new Employee("Eman");

  workers [0]=new  Employee ("Yakov"+ "fain");
  workers [1]=new  Employee ("Eman"+ "Mostafa");
  workers [2]=new  Employee ("Eman"+ "Taha");
  workers [3]=new  Employee ("Dalia"+ "Said");
  workers [4]=new Contractor ("Nashwa", "fain");
    for (int i = 0; i < 5; i++) {
        Employee currentEmployee;
        Contractor currentContractor;
        if (workers[i] instanceof Employee) {
            currentEmployee =(Employee) workers[i];
            System.out.println("instance of employee");
            currentEmployee.increaseSalary(31);
        } else if (workers[i] instanceof Contractor) {
            currentContractor = (Contractor) workers[i];
            System.out.println("instance of Contractor");
            currentContractor.increaseSalary(30);
        }
    }

}

    public BigDecimal getFactorial(int num) {
    BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1 ; i <= num; i++) {

            factorial = factorial.multiply(new BigDecimal(i));
        }
        return factorial;
    }


}
