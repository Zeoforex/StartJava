import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите число, с которым будете работать");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        System.out.println("Теперь знак, с котором будете работать");
        char sign = sc.next().charAt(0);

        System.out.println("Введите второе число, с которым будете работать");
        int secondNumber = sc.nextInt();

        if (sign == '+') {
            int result = enteredNumber + secondNumber;
            System.out.println("Ваш ответ " + result);
        } else if (sign == '-') {
            int result = enteredNumber - secondNumber;
            System.out.println("Ваш ответ " + result);
        } else if (sign == '*') {
            int result = enteredNumber * secondNumber;
            System.out.println("Ваш ответ " + result);
        } else if (sign == '/'){
            int result = enteredNumber / secondNumber;
            System.out.println("Ваш ответ " + result);
        } else if (sign == '^'){
            int result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result= result * enteredNumber;
            }
            System.out.println("Ваш ответ " + result);
        } else if (sign == '%') {
            int result = enteredNumber % secondNumber;
            System.out.println("Ваш ответ " + result);
        }   
    }
}