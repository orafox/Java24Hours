package com.ch22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class DisplayJTable extends JFrame {
    JButton jButton1 = new JButton();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JPasswordField jPasswordField = new JPasswordField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JButton jButton2 = new JButton();
    Statement stmt;
    Connection conn;
    ResultSet rs;
    static  JTable jtable;
    JFrame frame1;

    Vector<Vector<Object>> data = new Vector<Vector<Object>>();

    public DisplayJTable() {
        try {
            jbInit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DisplayJTable();

    }

    void jbInit() throws Exception {
      //  this.getContentPane().setLayout(null);
        frame1 = new JFrame("Database Search Result");

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());
        frame1.setLayout(new BorderLayout());


        frame1.setSize(1000, 900);
        frame1.setTitle("Oracle");
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  this.setResizable(false);
        // this.getContentPane().add(jButton2);
        frame1.getContentPane().add(jLabel3, null);
        frame1.getContentPane().add(jLabel2, null);
        frame1.getContentPane().add(jLabel1, null);
        frame1.getContentPane().add(jPasswordField, null);
        frame1.getContentPane().add(jTextField2, null);
        frame1.getContentPane().add(jTextField1, null);
        frame1.getContentPane().add(jButton1, null);
        frame1.getContentPane().add(jButton2, null);
        jtable = new JTable();
        frame1.getContentPane().add(jtable);
//
        jButton1.setText("exit");
        jButton1.setBounds(new Rectangle(800, 800, 85, 30));

        jButton2.setText("connect");
        jButton2.setBounds(new Rectangle(800, 600, 85, 30));
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1_actionPerformed(e);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });

    }

    void jButton1_actionPerformed(ActionEvent event) {
        System.exit(0);

    }

    void jButton2_actionPerformed(ActionEvent event) {
        try {
            //   Class.forName("oracle.jdbc.dirver.OracleDriver");
//            conn = DriverManager.getConnection("jdbc:oracle:thin@" + jTextField1.getText() + ":1521:orcl");

            conn = DriverManager.getConnection("jdbc:sqlserver://192.168.56.101:1433;databaseName=AdventureWorks2019", "sa", "P@ssw0rd");
            JOptionPane.showMessageDialog(this, "connection Successful");
            stmt = conn.createStatement();
//            String r = JOptionPane.showInputDialog(this, "pleas insert selct query");
            String r = "select TOP (20) NationalIDNumber ,[BusinessEntityID],[LoginID] FROM [AdventureWorks2019].[HumanResources].[Employee]";
//            String r = "select TOP (20) * FROM [AdventureWorks2019].[HumanResources].[Employee]";

            rs = stmt.executeQuery(r);
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            Vector<String> columnNames = new Vector<String>();
            Vector column = new Vector(columnCount);
            for (int i = 1; i <= columnCount; i++) {
                column.add(md.getColumnName(i));
                System.out.println(md.getColumnName(i));
            }
            column.add(columnNames);
            Vector data = new Vector();
            // Vector row = new Vector();
            while (rs.next()) {
                Vector<Object> row = new Vector<Object>();

                for (int i = 1; i <= columnCount; i++) {

                    row.addElement(rs.getObject(i));
                    System.out.println(rs.getString(i));
                }
                data.add(row);
            }

            //  DefaultTableModel model = new DefaultTableModel( column,data);
            jtable = new JTable(data, column);
            jtable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

            jtable.setFillsViewportHeight(true);
//            jtable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           jtable.setFillsViewportHeight(true);
//            this.add(new JScrollPane(jtable));
            //jtable.setSize(200,200);
//            this.getContentPane().add(new JScrollPane(jtable), null);
            JScrollPane scroll = new JScrollPane(jtable);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         //   add(scroll);
            frame1.getContentPane().add(scroll);
            frame1.add(scroll, BorderLayout.CENTER);
            frame1.setVisible(true);
          //  frame1.pack();
            //frame1.setSize(1000, 900);
//            add(this, new JScrollPane(jtable));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
