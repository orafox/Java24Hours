package com.ch21;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeTest3 {
    public static void main(String[] args) {
        ArrayList<EmployeeDTO> empArray = new ArrayList<>();
        String sqlQry = "select * from employee";
        try (
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sqlQry)

        ) {
            while (rs.next()) {
                EmployeeDTO currEmployee = new EmployeeDTO();
                currEmployee.setEmpno(rs.getInt(1));
                currEmployee.seteName(rs.getString(2));
                currEmployee.setJobTitle(rs.getString(3));
                empArray.add(currEmployee);
            }
            empArray.forEach(System.out::println);

                PreparedStatement stmt2 = conn.prepareStatement("select * from employee where empno=?");
       //  for (int i = 0; i < empArray.size(); i++) {
                stmt2.setInt(1, 7499);
                ResultSet rss = stmt2.executeQuery();
             while (  rss.next()) {
                 System.out.println(rss.getString(2));
             }
           // }

            PreparedStatement stmtIns = conn.prepareStatement("insert into employee values (?,?,?)");
            stmtIns.setInt(1, 1);
            stmtIns.setString(2, "EEE");
            stmtIns.setString(3, "General Manager");
            int i = stmtIns.executeUpdate();
            System.out.println("record inserted :" + i);

            CallableStatement stmtc = conn.prepareCall("{call changeEmpTitle(?,?)}");
            stmtc.setInt(1, 7566);
            stmtc.setString(2, "Salesman");
            stmtc.executeUpdate();
//
//            CallableStatement stmtc2 = conn.prepareCall("{call getEmpTitle(?,?)}");
//            stmtc2.setInt(1, 7566);
//            stmtc2.registerOutParameter(2, Types.VARCHAR);
//            stmtc2.executeQuery();
//            String title = stmtc2.getString(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
