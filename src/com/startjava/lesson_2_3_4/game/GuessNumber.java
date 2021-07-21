package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player playerOne;
    private final Player playerTwo;

    int enteredNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    Scanner sc = new Scanner(System.in);
    Random computerGenerator = new Random();
    int randomNumber = computerGenerator.nextInt(100) + 1;

    public void launch() {
        while (move(playerOne) && move(playerTwo)){
            System.out.println("Не угадал");
        }
        output(playerOne);
        output(playerTwo);
    }

    private void input(Player player) {
        System.out.println(player.getName() + " " + "ввод числа:");
        player.setAttempts(sc.nextInt());
    }

    public boolean move(Player player) {
        if (player.getCount()>9) {
            System.out.println(player.getName()+" попытки кончились ");
            System.out.println("Число компьютера было " + randomNumber);
            return true;
        }
        input(player);
        return !check(player);
    }

    private boolean check(Player player) {
        enteredNumber = player.getAttempts()[player.getCount() - 1];
        if (enteredNumber ==  randomNumber) {
            System.out.println("Игрок " + player.getName() + " вы угадали число с " + player.getCount() +
                    " попытки");
            return true;
        }
        System.out.println(player.getName() + " ваше число " + (enteredNumber < randomNumber ? "меньше, " : "больше,") + "чем загадал компьютер ");
        return false;
    }

    private void output(Player player) {
        System.out.println(player.getName() + " " + " ваши попытки");
        for (int number:player.getAttempts()) {
            System.out.println(number + " ");
        }
        player.nullArray();
    }
}