package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setAge(5);
        wolfOne.setColor("grey");

        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());

        wolfOne.hunt();
        wolfOne.move();
    }
}