package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] attempts = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, count);
    }

    public void setAttempts(int number) {
        attempts[count] = number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void nullArray() {
        Arrays.fill(attempts, 0, count, 0);
    }
}
