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

            GuessNumber gameGo = new GuessNumber(playerOne.getName(), playerTwo.getName());

            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                Scanner scanner = new Scanner(System.in);
                reply = scanner.nextLine();
            }
        } while (reply.equals("yes"));
    }
}