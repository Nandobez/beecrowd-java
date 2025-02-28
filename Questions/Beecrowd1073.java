import java.util.Scanner;

public class Beecrowd1073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

       
        if (N <= 5 || N >= 2000) {
            input.close();
            return;
        }

       
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                int res = i * i;
                System.out.printf("%d^2 = %d%n", i, res);
            }
        }

        input.close();
    }
}