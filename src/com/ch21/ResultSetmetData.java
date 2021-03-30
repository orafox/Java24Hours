package com.ch21;

import java.sql.*;

public class ResultSetmetData {
    public static void main(String[] args) {
        String sqlquery = "select * from employee";
        try  {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlquery);
                ResultSetMetaData resultSetmetData =  rs.getMetaData();
            int colCount = resultSetmetData.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                System.out.println("Column Name :" + resultSetmetData.getColumnName(i) + " column type:" + resultSetmetData.getColumnTypeName(i));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
