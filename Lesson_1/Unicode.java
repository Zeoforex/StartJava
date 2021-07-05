public class Unicode {
    public static void main(String[] args) {
        int firstNumber = 9398;
        int secondNumber = 10179;
        for (int i = firstNumber; i < secondNumber; i++) {
            char unicode = (char) i;
            System.out.println(unicode);
        }
    }
}