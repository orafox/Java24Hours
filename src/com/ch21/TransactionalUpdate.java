package com.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionalUpdate {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/lesson21");
             Statement stmt = conn.createStatement();

        ) {
            conn.setAutoCommit(false);
            stmt.addBatch("insert into Orders values(123, 'Buy','IBM',200)");
//            stmt.addBatch("insert into OrderDetail values('JSmith', 'Broker131', '05/20/02')");
            stmt.executeBatch();
            conn.commit();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
