import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;

    public int inputFirstNumber() {
        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        firstNumber = sc.nextInt();
        return firstNumber;
    }

    public char signInput() {
        System.out.print("Введите знак математической операции: ");
        Scanner sc = new Scanner(System.in);
        sign = sc.next().charAt(0);
        return sign;
    }

    public int inputSecondNumber() {
        System.out.print("Введите второе число: ");
        Scanner sc = new Scanner(System.in);
        secondNumber = sc.nextInt();
        return secondNumber;
    }
    public int totalValue(int firstNumber, int secondNumber,int sign) {
        int result = 0;
        switch (sign) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            case '^' -> {
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
            }
            case '%' -> result = firstNumber % secondNumber;
        }
        System.out.print("Ваш ответ: ");
        return result;
    }
}