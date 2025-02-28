import java.util.Locale;
import java.util.Scanner;

class Beecrowd1079{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i < N; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            double Med = ((x * 2) + (y * 3) + (z * 5)) / 10;
            System.out.printf("%.1f%n",Med);
        }

        input.close();
    }
}