package com.ch14;

import com.ch03.Tax;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Vector;

public class TaxGuiFile extends JFrame {
    JLabel lblGrIncome;
    JTextField txtGrossIncome = new JTextField();
    JLabel lblDependents = new JLabel("Number of Dependents");
    JTextField txtDependents = new JTextField(2);
    JLabel lblState = new JLabel("State: ");
    Vector<String> states = new Vector<>(50);
    JComboBox chState = new JComboBox(states);
    JLabel lblTax = new JLabel("state tax:");
    JTextField txtStateTax = new JTextField(10);
    JButton bGO = new JButton("go");
    JButton bReset = new JButton("Reset");

    public TaxGuiFile() throws HeadlessException {
        lblGrIncome = new JLabel("Gross Income:");
        GridLayout gr = new GridLayout(5, 2, 1, 1);
        setLayout(gr);
        add(lblGrIncome);
        add(txtGrossIncome);
        add(lblDependents);
        add(txtDependents);
        add(lblState);
        add(chState);
        add(lblTax);
        add(txtStateTax);
        add(bGO);
        add(bReset);

        populateStates();
        chState.setSelectedIndex(0);
        txtStateTax.setEditable(false);
        bGO.addActionListener(evt -> {
                    try {
                        int groosInc = Integer.parseInt((txtGrossIncome.getText()));
                        int dependents = Integer.parseInt(txtDependents.getText());
                        String state = (String) chState.getSelectedItem();
                        Tax tax = new Tax(groosInc, state, dependents);
                        String sTax = Double.toString(tax.calcTax());
//            String sTax = tax.calcTax();  //Double.toString(tax.calcTax());
                        txtStateTax.setText(sTax);

                    } catch (NumberFormatException e) {
                        txtStateTax.setText("non-Numberic data");
                    } catch (Exception ee) {
                        ee.printStackTrace();
                        txtStateTax.setText(ee.getMessage());
                    }

                }

        );
        bReset.addActionListener((evt)->{

            txtStateTax.setText("");
            txtDependents.setText("");
            txtGrossIncome.setText("");
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
                super.windowClosed(e);
            }
        });
    }

    public void populateStates() {
        states.add("select state");
        try (FileInputStream myFile = new FileInputStream("stats.txt")) {
            InputStreamReader inputStreamReader = new InputStreamReader(myFile);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String stateName;
            while ((stateName = reader.readLine()) != null) {
                states.add(stateName);

            }
        } catch (IOException e) {
            txtStateTax.setText("can't read state.txt "+e.getMessage());
        }


    }

    public static void main(String[] args) {
        TaxGuiFile taxframe = new TaxGuiFile();
        taxframe.setSize(1000, 900);
        taxframe.setVisible(true);
    }
}
