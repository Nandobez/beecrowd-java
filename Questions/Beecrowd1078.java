import java.util.Scanner;

public class Beecrowd1078 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(i + " x " + N + " = " + (i * N));
        }

        input.close();
    }
}
