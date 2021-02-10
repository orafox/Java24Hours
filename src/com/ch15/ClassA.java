package com.ch15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.fName = "eman";
        emp.lName = "mostafa";
        emp.salary = 10000;
        try (FileOutputStream fOut = new FileOutputStream("BestEmployee.ser");
             ObjectOutputStream oOut = new ObjectOutputStream(fOut)
        ) {
            oOut.writeObject(emp);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Employee Object Has been serialized into bestEmployee.ser");

    }
}
