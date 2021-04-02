package com.ch21;

import java.sql.*;

public class ShowAnyData {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage :Java ShowAnyData SqlSelectStatement");
            System.out.println("For example: java ShowAnyData \"select * from employee\"");
            System.exit(0);

        }
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             //
             //  try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.225.128:1521:orcl","hr","hr");

             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(args[0])) {
            ResultSetMetaData rsMeta = rs.getMetaData();
            int colCount = rsMeta.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rsMeta.getColumnName(i) + " ");


            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println("\n");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
