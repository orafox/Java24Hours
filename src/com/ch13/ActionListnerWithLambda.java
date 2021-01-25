package com.ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListnerWithLambda {
    public static void main(String[] args) {
        JButton oldButton = new JButton("i'm an old java button");
        JButton newButton = new JButton("i'm an new java button");
        JTextField myConsole = new JTextField("click a button");
        oldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myConsole.setText("Processng click with anonymous inner");

            }
        });

        newButton.addActionListener(e->{
            myConsole.setText("processing click with lambda");

        });

        JFrame frame = new JFrame("lambda in swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(oldButton, BorderLayout.NORTH);
        frame.add(newButton, BorderLayout.CENTER);
        frame.add(myConsole, BorderLayout.SOUTH);
        frame.setSize(300, 400);
        frame.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("do something in this thread");

            }
        });
    }
}
