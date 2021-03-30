package com.ch21;

import org.apache.derby.client.am.CachingLogicalConnection;
import org.apache.derby.client.am.SqlException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeListTest {
    public static void main(String[] args) {
        String sqlStatement = "select * from employee";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlStatement)


        ) {
            while (rs.next()) {
                int empNo = rs.getInt("empNo");
                String emName = rs.getString("ename");
                String job = rs.getString("job_title");
                System.out.println("" + empNo + ";" + emName + "+" + job);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
