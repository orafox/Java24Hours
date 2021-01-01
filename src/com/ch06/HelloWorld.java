package com.ch06;

import javax.swing.*;

public class HelloWorld extends JFrame {
    public static void main(String[] args) {
        JFrame myWindow = new HelloWorld();
        JButton myButton = new JButton("click me");
        myWindow.add(myButton);
        myWindow.setSize(200, 200);
        myWindow.setTitle("HelloWorld");
        myWindow.setVisible(true);
    }
}
