package com.ch22;

import com.ch22.Order;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MyFraem extends JFrame implements TableModelListener {
    private  JTable myTable;
    private MyTableModel myTableModel;

    MyFraem(String winTitle) {
        super(winTitle);
        myTableModel = new MyTableModel();
        myTable = new JTable(myTableModel);

        add(new JScrollPane((myTable)));
        myTableModel.addTableModelListener(this);

    }

    public void tableChanged(TableModelEvent event) {

    }

    public static void main(String[] args) {
        MyFraem myFraem = new MyFraem("myTest Window");
        myFraem.pack();
        myFraem.setVisible(true);

    }




}

class MyTableModel extends AbstractTableModel {
    ArrayList<Order> myData = new ArrayList<>();
    String[] orderColNames = { "Order ID",   "Symbol",
            "Quantity", "Price"};

    public MyTableModel() {
//        myData.add(new Order(1, "IBM", 100, 135.5f));

        myData.add(new Order(1,"IBM", 100, 135.5f));
        myData.add(new Order(2,"AAPL", 300, 290.12f));
        myData.add(new Order(3,"MOT", 2000, 8.32f));
        myData.add(new Order(4,"ORCL", 500, 27.8f));

    }

    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return myData.size();
    }

    public Object getValueAt(int row, int col) {

        switch (col) {
            case 0:
                return myData.get(row).orderID;
            case 1:
                return myData.get(row).stockSymbol;
            case 2:
                return myData.get(row).quantity;
            case 3:
                return myData.get(row).price;
            default:
                return "";
        }
    }

    public String getColumnName(int col) {
        return orderColNames[col];
    }

    public boolean isCellEditable(int row, int col) {
        if (col == 2) {
            return true;
        } else return false;

    }

    public void setValueAt(Object value, int row, int col) {
        if (col == 2) {
            myData.get(row).quantity = Integer.valueOf(value.toString());
        }
        TableModelEvent event = new TableModelEvent(this, row, row, col);
        fireTableChanged(event);

    }

}
