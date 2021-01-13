package com.ch08;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorEngine2 implements ActionListener, MouseListener, MouseMotionListener {
    private Calculator parent;

    public CalculatorEngine2(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object eventSource = e.getSource();
        if (eventSource instanceof JButton)
            ((JButton) eventSource).setToolTipText("You now clicked on " + ((JButton) eventSource).getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object eventSource = e.getSource();
        if (eventSource instanceof JButton) {
            ((JButton) eventSource).setToolTipText("You now pressed on " + ((JButton) eventSource).getText());
            System.out.println( ((JButton) eventSource).getText());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField myDisplayField = null;
        Object eventSource = e.getSource();
        JButton clickedButton = null;

        if (eventSource instanceof JButton) {
            clickedButton = (JButton) eventSource;
            String dispFieldText = parent.getDisplayValue();
            String clickButton = clickedButton.getText();
            parent.setDisplayValue(dispFieldText + clickButton);
        } else
            myDisplayField = (JTextField) eventSource;
//        String clickedButtonLabel = clickedButton.getText();
//        JOptionPane.showConfirmDialog(null, "you Pressed >" + clickedButtonLabel, "just a tesst ", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse dragged");
        JOptionPane.showConfirmDialog(null, "mouse dragged >" , "just a tesst ", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse moved");
        JOptionPane.showConfirmDialog(null, "mouse moved >" , "just a tesst ", JOptionPane.PLAIN_MESSAGE);

    }
}
