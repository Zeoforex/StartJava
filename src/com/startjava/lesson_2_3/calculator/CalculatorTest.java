package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        String reply = "";
        do {
            System.out.print("Введите первое число: ");
            int firstNumber = sc.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = sc.next().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = sc.nextInt();
            int result = calculator.calculate(firstNumber, secondNumber, sign);

            System.out.println(result);

            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                Scanner scanner = new Scanner(System.in);
                reply = scanner.next();
            }
        } while (reply.equals("yes"));
    }
}
