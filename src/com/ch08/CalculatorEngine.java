package com.ch08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    private static final String ERROR_MESSAGE = "Error!";
    private static final int DIGIT_BUTTON_PRESSED = 1;
    private static final int OPERATION_BUTTON_PRESSED = 2;
    private static final int EQUAL_BUTTON_ORESSED = 3;
    private int currentEvent;
    private String currentButtonValue;
    private NewCalculator newCalculator;
    private Operations operations;
    private Double firstArg;
    private Double secondArg;
    private Double operationResult;

    public CalculatorEngine(NewCalculator newCalculator) {
        this.newCalculator = newCalculator;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object eventSource = actionEvent.getSource();
        if (eventSource instanceof JButton) {
            processButtonClick((JButton) eventSource);
        }
    }
//All possible calculation preconditions

    //All arguments and result not defined (First argument input)
    private Boolean x1() {
        if (firstArg == null && secondArg == null && operationResult == null) return true;
        else return false;
    }

    //First argument defined, second argument, result not defined (Second argument input)
    private Boolean x2() {
        if (firstArg != null && secondArg == null && operationResult == null) return true;
        else return false;
    }

    //First argument not defined, second argument, result defined (The last operation repeated)
    private Boolean x3() {
        if (firstArg == null && secondArg != null && operationResult != null) return true;
        else return false;
    }

    private Double doCalcution() {
        Double ret = null;
        switch (operations) {
            case ADDITION:
                ret = firstArg + secondArg;
                break;
            case SUBTRACTION:
                ret = firstArg - secondArg;

                break;
            case DIVISION:
                if (secondArg != 0)
                    ret = firstArg / secondArg;
                break;
            case MULTIPLYING:
//                if(secondArg!=0)
                ret = firstArg * secondArg;
                break;
            case ILLEGAL_OPERATION:
            default:
                break;

        }
        return ret;
    }

    private Operations getOperationFromString(String string) {
        if(string == "+") {
            return Operations.ADDITION;
        } else if(string == "-") {
            return Operations.SUBTRACTION;
        } else if(string == "*") {
            return Operations.MULTIPLYING;
        } else if(string == "/") {
            return Operations.DIVISION;
        } else {
            return Operations.ILLEGAL_OPERATION;
        }
    }
    private void processButtonClick(JButton button) {

    }
}
