package com.ch21;

import java.sql.*;

public class EmployeeList {
    public static void main(String[] args) {
        String sqlQuery = "select * from Employee";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sqlQuery)) {
            while (rs.next()) {
                int empno = rs.getInt("Empno");
                String eName = rs.getString("Ename");
                String job = rs.getString("job_title");
                System.out.println("" + empno + ";" + eName + ";" + job);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
