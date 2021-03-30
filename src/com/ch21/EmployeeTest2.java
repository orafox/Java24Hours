package com.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeTest2 {
    public static void main(String[] args) {
        String sqlstatment = "select * from employee";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             Statement stmt = conn.createStatement()
             ;
             ResultSet rs = stmt.executeQuery(sqlstatment)
        ) {
            while (rs.next()) {
                int empno = rs.getInt(1);
                String empname = rs.getString(2);
                String jobTitle = rs.getString(3);
                System.out.println("empno:" + empno + " empName:" + empname + " jobTitle:"+jobTitle);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
