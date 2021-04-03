package com.ch22;

import java.sql.*;


public class helloMsSql {

    public static void main(String[] args) {

        System.out.println("hello");
        String mySql = "select * FROM [AdventureWorks2019].[HumanResources].[Employee]";

        try (Connection conn = DriverManager.getConnection("jdbc:sqlserver://192.168.56.101:1433;databaseName=AdventureWorks2019", "sa", "P@ssw0rd");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(mySql)) {
            ResultSetMetaData rsmeta = rs.getMetaData();
            int colCount = rsmeta.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rsmeta.getColumnName(i) + "          ");

            }
            System.out.println(" ");

            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(rs.getString(i) + "          ");
                }
                System.out.println("/n");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
