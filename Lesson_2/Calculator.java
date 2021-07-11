import java.util.Scanner;

public class Calculator {
    
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public int calculate(int firstNumber,int secondNumber, int sign) {
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
