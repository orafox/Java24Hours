package com.ch15;

import java.io.*;

public class TestEmployee {
    public static void main(String[] args) {
        Employee bestEmployee = new Employee();
        ByteArrayOutputStream baOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oOut  = new ObjectOutputStream(baOut);
            oOut.writeObject(bestEmployee);

            ByteArrayInputStream baIn = new ByteArrayInputStream(baOut.toByteArray());
            ObjectInputStream oIn = new ObjectInputStream(baIn);
            Employee cloneBestEmployee = (Employee) oIn.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
