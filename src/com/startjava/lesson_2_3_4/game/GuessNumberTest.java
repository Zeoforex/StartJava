package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String reply = "";
        do {
            System.out.println("Введите имя первого игрока");
            Player playerOne = new Player(sc.nextLine());
            System.out.println("Введите имя второго игрока");
            Player playerTwo = new Player(sc.nextLine());
            GuessNumber myGame = new GuessNumber(playerOne, playerTwo);
            myGame.launch();

            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                reply = sc.nextLine();
            }
        } while (reply.equals("yes"));
    }
}
