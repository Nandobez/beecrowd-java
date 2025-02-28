import java.util.Scanner;

public class Beecrowd1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 5; i++){
            int N = input.nextInt();

            if(N % 2 == 0){
                count++;
            }
        }

        System.out.println(count + " valores pares");
        input.close();
    }
}
