package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    public void start() {

        String reply = "";
        do {
            System.out.println("Введите математическое выражение: Например(2 + 10) ");
            Scanner sc = new Scanner(System.in);

            String string = sc.nextLine();
            String myText = string.replaceAll("\\s","");
            String[] nums = myText.split("\\D+");
            String[] signs = myText.split("\\d+");

            int numFirst = Integer.parseInt(nums[0]);
            char sign = signs[1].charAt(0);
            int numSecond = Integer.parseInt(nums[1]);
            calculate(numFirst, numSecond, sign);


            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                Scanner scanner = new Scanner(System.in);
                reply = scanner.next();
            }
        } while (reply.equals("yes"));
    }


        private void calculate(int num1, int num2, char sign) {
            int result;
            switch (sign) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                case '^' -> {
                    result = 1;
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                }
                case '%' -> result = num1 % num2;
                default -> throw new IllegalStateException("Unexpected value: " + sign);
            }
            System.out.println("Твой ответ: " + result);
    }
}