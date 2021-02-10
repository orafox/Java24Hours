package com.ch15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB {
    public static void main(String[] args) {
        try (FileInputStream fIn = new FileInputStream("BestEmployee.ser");
             ObjectInputStream oIn = new ObjectInputStream(fIn)) {
            Employee bestEmp = (Employee) oIn.readObject();
            System.out.println(bestEmp.fName+" "+bestEmp.lName);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("the Employee Object has been Deserialized");
    }
}
