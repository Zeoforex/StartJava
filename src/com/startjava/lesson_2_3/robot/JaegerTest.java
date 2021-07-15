package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger Striker = new Jaeger("Striker Eureka", "Mark-5", "Australian", 76.2f, 1.85f, 10, 10, 9);
        Striker.scan();
        Striker.move();
        System.out.println("Модель " + Striker.getModelName());
        System.out.println("Марка " + Striker.getMark());
        System.out.println("Происхождение " + Striker.getOrigin());
        System.out.println("Высота " + Striker.getHeight());
        System.out.println("Вес " + Striker.getWeight());
        System.out.println("Скорость " + Striker.getSpeed());
        System.out.println("Сила " + Striker.getStrength());
        System.out.println("Броня " + Striker.getArmor());
        System.out.println("");

        Jaeger Gipsy = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);
        Gipsy.move();
        Gipsy.shoot();
        Gipsy.scan();
        System.out.println("Модель " + Gipsy.getModelName());
        System.out.println("Прототип " + Gipsy.getMark());
        System.out.println("Происхождение" + Gipsy.getOrigin());
        System.out.println("Высота " + Gipsy.getHeight());
        System.out.println("Вес " + Gipsy.getWeight());
        System.out.println("Скорость " + Gipsy.getSpeed());
        System.out.println("Сила " + Gipsy.getStrength());
        System.out.println("Броня " + Gipsy.getArmor());
    }
}
