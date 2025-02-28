import java.util.Scanner;

public class Beecrowd1144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int N = input.nextInt();
        

       
        int calc2 = 0;
        int calc3 = 0;
        int Calc2 = 0;
        int Calc3 = 0;

        for(int i = 1; i < (N + 1); i++){
            
            calc2 = i * i;
            calc3 = i * i * i;

            System.out.printf("%d %d %d%n", i, calc2, calc3);

            
            Calc2 = calc2 + 1;
            Calc3 = calc3 + 1;

            System.out.printf("%d %d %d%n", i, Calc2, Calc3);
            
            Calc2 = Calc3 = 0;
        }

        input.close();
    }
}
//Tem Insight