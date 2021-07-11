public class CalculatorTest {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean continueOrNo = true;

        do {
            System.out.print("Введите первое число: ");
            Scanner sc = new Scanner(System.in);
            int firstNumber = sc.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = sc.next().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = sc.nextInt();
            int result = calculator.calculate(firstNumber, secondNumber, sign);

            System.out.println(result);

            String reply = "";
            while (!reply.equals("yes")) {
                
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                Scanner scanner = new Scanner(System.in);
                reply = scanner.nextLine();

                if (reply.equals("no")) {
                    continueOrNo = false;
                    break;
                }
            }

        } while (continueOrNo);
    }
}