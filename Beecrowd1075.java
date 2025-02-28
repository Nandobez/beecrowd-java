import java.util.Scanner;

public class Beecrowd1075 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 1; i < 10001; i++){
            if(i % N == 2){
                System.out.println(i);
            }
        }

        input.close();
    }
}
