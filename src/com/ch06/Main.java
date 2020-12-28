package com.ch06;

public abstract class Main implements Payable{

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
  workers [3]=new  Employee ("Yakov"+ "fain");
  workers [4]=new  Employee ("Yakov"+ "fain");

}



}
