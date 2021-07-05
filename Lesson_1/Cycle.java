public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }
        int k = 6;
        while (k <= 6) {
            if (k <- 6) {
                break;
            }
            System.out.println(k);
            k -= 2;
        }
        int sum = 0;
        int f = 10;
        do {
            f++;
            if (f % 2 ==1) {
                sum += f;
            }
        }while (f < 20);
        System.out.println(sum);
    }
}