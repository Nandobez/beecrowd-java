import java.util.Scanner;

public class Beecrowd1132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N1 = input.nextInt();
        int N2 = input.nextInt();
        int sum = 0;

        if(N1 > N2){
            int temp = 0;

            temp = N1;
            N1 = N2;
            N2 = temp;

        }

        for(int i = N1; i < N2 + 1; i++){

            if(!(i % 13 == 0)){
                sum = i + sum;
            }

        }

        System.out.println(sum);

        input.close();
    }
}
