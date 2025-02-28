import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 6; i++){
            double N = input.nextDouble();

            if(N > 0){
                count++;
            }



        }

        System.out.println(count + " valores positivos");
        input.close();
    }
}
