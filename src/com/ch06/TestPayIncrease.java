package com.ch06;

public abstract class TestPayIncrease implements Payable{

public static void main(String[] args) {
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
        } else if (workers[i] instanceof Contractor) {
            currentContractor = (Contractor) workers[i];
            System.out.println("instance of Contractor");
        }
    }

}



}
