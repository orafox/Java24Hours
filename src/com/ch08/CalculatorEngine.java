package com.ch08;

public class CalculatorEngine {
    private static final String ERROR_MESSAGE = "Error!";
    private static final int DIGIT_BUTTON_PRESSED=1;
    private static final int OPERATION_BUTTON_PRESSED=2;
    private static final int EQUAL_BUTTON_ORESSED=3;
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
}
