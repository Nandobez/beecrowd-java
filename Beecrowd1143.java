import java.util.Scanner;

public class Beecrowd1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 1; i < N + 1; i++){
            int x = i * i;
            int y = i * i * i;

            System.out.printf("%d %d %d%n", i, x, y);
        }
        input.close();
    }
    
}
