package com.ch08;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout();
        GridLayout gl = new GridLayout(4,2);
//        windowContent.setLayout(fl);
        windowContent.setLayout(gl);
        JLabel lable1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel lable2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JTextField result = new JTextField(10);

        JLabel label3 = new JLabel("Sum:");
        JButton go = new JButton("add");
        windowContent.add(lable1);
        windowContent.add(field1);
        windowContent.add(lable2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        JFrame frame = new JFrame("MyFirstCalculator");
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setVisible(true);

        JOptionPane.showConfirmDialog(null, "Somthing Happeded.>", "just a tesst ", JOptionPane.PLAIN_MESSAGE);


    }
}
