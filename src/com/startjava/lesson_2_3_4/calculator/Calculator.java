package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String sign;

    public int calculate(String expression) {
        rightInput(expression);
        switch (sign) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            case "/" -> {
                return firstNumber / secondNumber;
            }
            case "^" -> {
                int result = 1;
                for (int i = 0; i < secondNumber; i++) {
                        result *= firstNumber;
                    }
                return result;
                }
            case "%" -> {
                return firstNumber % secondNumber;
            }
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        }
    }

    private void rightInput(String expression) {
        String[] array = expression.split(" ");
        firstNumber = Integer.parseInt(array[0]);
        sign = array[1];
        secondNumber = Integer.parseInt(array[2]);
    }

}