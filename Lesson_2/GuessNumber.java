import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private String playerOne;
    private String playerTwo;

    int enteredNumber;

    public GuessNumber(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        Scanner sc = new Scanner(System.in);

        Random computerGenerator = new Random();
        int randomNumber = computerGenerator.nextInt(100) + 1;
        while (true){
            System.out.println(playerOne + " ввод числа:");
            enteredNumber = sc.nextInt();
            if (enteredNumber > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (enteredNumber < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победил первый игрок ");
                break;
            }
            System.out.println(playerTwo + " ввод числа:");
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
