package com.startjava.lesson_1.conditional_statement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Молодой");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Мужчина");
        }

        if (!maleGender) {
            System.out.println("Женщина");
        }

        double height = 1.85;
        if (height < 1.80) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }

        char firstLetterName = 'K';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква это M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква это I");
        } else {
            System.out.println("Первая буква это K");
        }
    }
}