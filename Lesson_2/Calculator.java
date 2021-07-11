import java.util.Scanner;

public class Calculator {
    public int calculate(int firstNumber, int secondNumber, char sign) {
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
