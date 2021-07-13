import java.util.Scanner;

public class Calculator {
    public int calculate(int firstNumber, int secondNumber, char sign) {
        return switch (sign) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            case '^' -> {
                int result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                yield result;
            }
            case '%' -> firstNumber % secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
    }
}