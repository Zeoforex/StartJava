package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player playerOne;
    private final Player playerTwo;

    Scanner sc = new Scanner(System.in);
    Random computerGenerator = new Random();
    int enteredNumber;
    int randomNumber = computerGenerator.nextInt(100) + 1;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        while (makeMove(playerOne) && makeMove(playerTwo)){
            System.out.println("Не угадал");
        }
        outputAttempts(playerOne);
        outputAttempts(playerTwo);
        playerOne.nullifyArray();
        playerTwo.nullifyArray();
    }

    private void inputAttempt(Player player) {
        System.out.println(player.getName() + " " + "ввод числа:");
        player.setAttempt(sc.nextInt());
    }

    private boolean makeMove(Player player) {
        if (player.getCount() > 9) {
            System.out.println(player.getName() + " попытки кончились ");
            System.out.println("Число компьютера было " + randomNumber);
            return true;
        }
        inputAttempt(player);
        return !checkAttempts(player);
    }

    private boolean checkAttempts(Player player) {
        enteredNumber = player.getLastNumber();
        if (enteredNumber ==  randomNumber) {
            System.out.println("Игрок " + player.getName() + " вы угадали число с " + player.getCount() + " попытки");
            return true;
        }
        System.out.println(player.getName() + " ваше число " + (enteredNumber < randomNumber ? "меньше, " : "больше,") + "чем загадал компьютер ");
        return false;
    }

    private void outputAttempts(Player player) {
        System.out.println(player.getName() + " " + " ваши попытки");
        for (int number : player.getAttempts()) {
            System.out.println(number + " ");
        }
    }
}