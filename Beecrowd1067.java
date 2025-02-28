import java.util.Scanner;

public class Beecrowd1067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for(int i = 1; i < N + 1; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
