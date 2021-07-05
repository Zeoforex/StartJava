import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random computerGenerator = new Random();
        int randomNumber = computerGenerator.nextInt(100) + 1;

        boolean flag = true;
        while (flag){
            System.out.println("Введите число");
            int myNumber = sc.nextInt();
            if (myNumber > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(myNumber < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили");
                flag = false;
            }
        }
    }
}