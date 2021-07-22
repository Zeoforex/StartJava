package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String reply = "";
        do {
            System.out.println("Введите математическое выражение: Например(2 + 10) ");
            Scanner sc = new Scanner(System.in);
            Calculator calculator = new Calculator();
            int result = calculator.calculate(sc.nextLine());
            System.out.println("Ваш ответ равен " + result);

            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                reply = sc.next();
            }
        } while (reply.equals("yes"));
    }
}
