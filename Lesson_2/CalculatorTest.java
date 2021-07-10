public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int first = calculator.inputFirstNumber();
        char signOne = calculator.signInput();
        int second = calculator.inputSecondNumber();
        int result = calculator.totalValue(first,second,signOne);

        System.out.println(result);

        String reply = "";
        while (!reply.equals("yes") && !reply.equals("no")) {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            Scanner sc = new Scanner(System.in);
            reply = sc.nextLine();
        }
        
        while (reply.equals("yes")) {

            int firstOne = calculator.inputFirstNumber();
            char sign = calculator.signInput();
            int secondOne = calculator.inputSecondNumber();
            int resultOne = calculator.totalValue(firstOne,secondOne,sign);

            System.out.println(resultOne);

            reply = "";
            while (!reply.equals("yes") && !reply.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                Scanner sc = new Scanner(System.in);
                reply = sc.nextLine();
            }
        }
    }
}