package com.ch13;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MethodReferenceSample extends JFrame {
    public void processButtonClick(ActionEvent event) {
        System.out.println("someone click me");

    }

    public static void main(String[] args) {
        MethodReferenceSample mrs = new MethodReferenceSample();
        JButton myButton = new JButton("click me");
        mrs.add(myButton);
        myButton.addActionListener(mrs::processButtonClick);
        mrs.pack();
        mrs.setVisible(true);
        mrs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
