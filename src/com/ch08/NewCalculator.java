package com.ch08;

import javax.swing.*;
import java.awt.*;

public class NewCalculator extends JFrame {
    private JPanel windowContent;
    private JTextField displayField;
    private JButton[] buttons;
    private String[] buttonNames;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;

    public String getDisplayFieldText() {
        return displayField.getText();
    }

    public NewCalculator() {
        super("Calculator");
        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        windowContent = new JPanel();
        gridBagLayout = new GridBagLayout();
        windowContent.setLayout(gridBagLayout);
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx=1.0;
        constraints.weighty=1.0;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;
    }
}
