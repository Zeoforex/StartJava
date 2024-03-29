package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String sign;

    public int calculate(String expression) {
        splitExpression(expression);
        return switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "^" -> {
                int result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                yield result;
            }
            case "%" -> firstNumber % secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
    }

    private void splitExpression(String expression) {
        String[] array = expression.split(" ");
        firstNumber = Integer.parseInt(array[0]);
        sign = array[1];
        secondNumber = Integer.parseInt(array[2]);
    }

}
