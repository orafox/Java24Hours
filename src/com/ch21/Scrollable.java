package com.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scrollable {
    public static void main(String[] args) {
        String sqlQuery = "select * from employee";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             Statement smtmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smtmt.executeQuery(sqlQuery)) {

            rs.afterLast();
            while (rs.previous()) {
                int empNo = rs.getInt("empno");
                String eName = rs.getString("ename");
                String job = rs.getString("job_title");
                System.out.println(" " + empNo + "," + eName + "," + job);
            }
            rs.absolute(2);
            int empNo = rs.getInt("empno");
            String eName = rs.getString("ename");
            String job = rs.getString("job_title");
            System.out.println(" row 2 :" + empNo + "," + eName + "," + job);
            rs.relative(1);
            rs.updateString("job_title", "Manager2");
            rs.updateRow();

            System.out.println(" row 3 :" + rs.getString(1) + "," + rs.getString(2)  + "," + rs.getString(3) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
