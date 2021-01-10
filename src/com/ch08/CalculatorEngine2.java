package com.ch08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine2 implements ActionListener {
    public CalculatorEngine2(Calculator calculator) {
        this.calculator = calculator;
    }

    private Calculator calculator;


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        JOptionPane.showConfirmDialog(null, "you Pressed >"+clickedButtonLabel, "just a tesst ", JOptionPane.PLAIN_MESSAGE);
    }
}
