import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;

    int enteredNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void gameGo() {
        Random computerGenerator = new Random();
        int randomNumber = computerGenerator.nextInt(100) + 1;
        while (true) {
            System.out.println(playerOne.getName() + " ввод числа:");
            enteredNumber = sc.nextInt();
            if (enteredNumber > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (enteredNumber < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победил первый игрок ");
                break;
            }
            System.out.println(playerTwo.getName() + " ввод числа:");
            enteredNumber = sc.nextInt();
            if (enteredNumber > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (enteredNumber < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победил второй игрок ");
                break;
            }
        }
    }
}
