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
            String[] nums = myText.split("\\D");
            String[] signs = myText.split("\\w");

            int numFirst = Integer.parseInt(nums[0]);
            char sign = signs[2].charAt(0);
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
            int result = 0;
            switch (sign) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println(result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println(result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println(result);
                }
                case '/' -> {
                    result = num1 / num2;
                    System.out.println(result);
                }
                case '^' -> {
                    result = 1;
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                    System.out.println(result);
                }
                case '%' -> {
                    result = num1 % num2;
                    System.out.println(result);
                }
            }
    }
}