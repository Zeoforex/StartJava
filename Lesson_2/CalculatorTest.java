public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int first = calculator.inputFirstNumber();
        char signOne = calculator.signInput();
        int second = calculator.inputSecondNumber();
        int result = calculator.totalValue(first,second,signOne);

        System.out.println(result);

    }
}